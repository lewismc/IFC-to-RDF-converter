var querystring = require('querystring');
var fs = require('fs');
eval(fs.readFileSync('settings.js', encoding="ascii"));
var http = require('http');

function httpPut() {
	// Build the post string from an object
	var post_data = querystring.stringify(data);	

	// An object of options to indicate where to post to
	var post_options = {
		host: 'localhost',
		port: settings.users_server_port,
		path: '/users',
		method: 'POST',
		headers: {
			'Content-Type': 'application/x-www-form-urlencoded',
			'Content-Length': post_data.length
	  }
	};

	// Set up the request
	var post_req = http.request(post_options, function(res) {
		res.setEncoding('utf8');
		res.on('data', function (chunk) {
			console.log(chunk);
		});
	});

	// post the data
	post_req.write(post_data);
	post_req.end();

}

function httpDelete(path) {
	var options = {
		host: 'localhost',
		port: settings.server_port,
		path: path,
		method: 'DELETE',
	};

	// Set up the request
	var req = http.request(options, function(res) {
		res.setEncoding('utf8');
		res.on('data', function (chunk) {
			console.log(chunk);
		});
	});

	// post the data
	//req.write(data);
	req.end();

}


function main(){
	
	if(process.argv.length > 2){
		var method = process.argv[2];
		if(method == 'post'){
			httpPut();
		}
		else if(method == 'delete'){
			httpDelete(process.argv[3]);
		}
		else {
			console.log("Error: unkown method");
		}
	} else {
		console.log("use: node testclient.js <HTTPmethod (put or delete)> <uri> [<file>]");
	}
}

main();