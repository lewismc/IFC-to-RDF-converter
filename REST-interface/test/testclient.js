var querystring = require('querystring');
var fs = require('fs');
eval(fs.readFileSync('settings.js', encoding="ascii"));
var http = require('http');

function httpPut(path) {
	var put_options = {
		host: 'localhost',
		port: settings.server_port,
		path: path,
		method: 'PUT',
	};

	// Set up the request
	var put_req = http.request(put_options, function(res) {
		res.setEncoding('utf8');
		res.on('data', function (chunk) {
			console.log(chunk);
		});
	});

	// post the data
	//put_req.write(post_data);
	put_req.end();

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
		if(method == 'put'){
			httpPut(process.argv[3]);
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