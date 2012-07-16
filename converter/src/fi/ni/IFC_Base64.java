
package fi.ni;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

/**
 * Based on  Base64 implementation of TAMURA Kent kent@trl.ibm.co.jp 
 * The used characters are different. 
 * 
 */
public class IFC_Base64 {
	
	
	
	private static char[] S_BASE64CHAR=null;
	private static final char S_BASE64PAD = '=';
	private static final byte[] S_DECODETABLE = new byte[128];
	static {
		S_BASE64CHAR="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz_$".toCharArray();
		for (int i = 0; i < S_DECODETABLE.length; i++)
			S_DECODETABLE[i] = Byte.MAX_VALUE; // 127
		for (int i = 0; i < S_BASE64CHAR.length; i++)
			// 0 to 63
			S_DECODETABLE[S_BASE64CHAR[i]] = (byte) i;
	}

	
	private static int decode0(char[] ibuf, byte[] obuf, int wp) {
		int outlen = 3;
		if (ibuf[3] == S_BASE64PAD)
			outlen = 2;
		if (ibuf[2] == S_BASE64PAD)
			outlen = 1;
		int b0 = S_DECODETABLE[ibuf[0]];
		int b1 = S_DECODETABLE[ibuf[1]];
		int b2 = S_DECODETABLE[ibuf[2]];
		int b3 = S_DECODETABLE[ibuf[3]];
		switch (outlen) {
		case 1:
			obuf[wp] = (byte) (b0 << 2 & 0xfc | b1 >> 4 & 0x3);
			return 1;
		case 2:
			obuf[wp++] = (byte) (b0 << 2 & 0xfc | b1 >> 4 & 0x3);
			obuf[wp] = (byte) (b1 << 4 & 0xf0 | b2 >> 2 & 0xf);
			return 2;
		case 3:
			obuf[wp++] = (byte) (b0 << 2 & 0xfc | b1 >> 4 & 0x3);
			obuf[wp++] = (byte) (b1 << 4 & 0xf0 | b2 >> 2 & 0xf);
			obuf[wp] = (byte) (b2 << 6 & 0xc0 | b3 & 0x3f);
			return 3;
		default:
			throw new RuntimeException("Internal Errror");
		}
	}

	/**
	 * Decode the base64 data.
	 * 
	 * @param data
	 *            The base64 encoded data to be decoded
	 * @param off
	 *            The offset within the encoded data at which to start decoding
	 * @param len
	 *            The length of data to decode
	 * @return The decoded data
	 */
	public static byte[] decode(char[] data, int off, int len) {
		char[] ibuf = new char[4];
		int ibufcount = 0;
		byte[] obuf = new byte[len / 4 * 3 + 3];
		int obufcount = 0;
		for (int i = off; i < off + len; i++) {
			char ch = data[i];
			if (ch == S_BASE64PAD || ch < S_DECODETABLE.length
					&& S_DECODETABLE[ch] != Byte.MAX_VALUE) {
				ibuf[ibufcount++] = ch;
				if (ibufcount == ibuf.length) {
					ibufcount = 0;
					obufcount += decode0(ibuf, obuf, obufcount);
				}
			}
		}
		if (obufcount == obuf.length)
			return obuf;
		byte[] ret = new byte[obufcount];
		System.arraycopy(obuf, 0, ret, 0, obufcount);
		return ret;
	}

	/**
	 * Decode the base64 data.
	 * 
	 * @param data
	 *            The base64 encoded data to be decoded
	 * @return The decoded data
	 */
	public static byte[] decode(String data) {
		char[] ibuf = new char[4];
		int ibufcount = 0;
		byte[] obuf = new byte[data.length() / 4 * 3 + 3];
		int obufcount = 0;
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch == S_BASE64PAD || ch < S_DECODETABLE.length
					&& S_DECODETABLE[ch] != Byte.MAX_VALUE) {
				ibuf[ibufcount++] = ch;
				if (ibufcount == ibuf.length) {
					ibufcount = 0;
					obufcount += decode0(ibuf, obuf, obufcount);
				}
			}
		}
		if (obufcount == obuf.length)
			return obuf;
		byte[] ret = new byte[obufcount];
		System.arraycopy(obuf, 0, ret, 0, obufcount);
		return ret;
	}

	/**
	 * Decode the base64 data.
	 * 
	 * @param data
	 *            The base64 encoded data to be decoded
	 * @param off
	 *            The offset within the encoded data at which to start decoding
	 * @param len
	 *            The length of data to decode
	 * @param ostream
	 *            The OutputStream to which the decoded data should be written
	 */
	public static void decode(char[] data, int off, int len,
			OutputStream ostream) throws IOException {
		char[] ibuf = new char[4];
		int ibufcount = 0;
		byte[] obuf = new byte[3];
		for (int i = off; i < off + len; i++) {
			char ch = data[i];
			if (ch == S_BASE64PAD || ch < S_DECODETABLE.length
					&& S_DECODETABLE[ch] != Byte.MAX_VALUE) {
				ibuf[ibufcount++] = ch;
				if (ibufcount == ibuf.length) {
					ibufcount = 0;
					int obufcount = decode0(ibuf, obuf, 0);
					ostream.write(obuf, 0, obufcount);
				}
			}
		}
	}

	/**
	 * Decode the base64 data.
	 * 
	 * @param data
	 *            The base64 encoded data to be decoded
	 * @param ostream
	 *            The OutputStream to which the decoded data should be written
	 */
	public static void decode(String data, OutputStream ostream)
			throws IOException {
		char[] ibuf = new char[4];
		int ibufcount = 0;
		byte[] obuf = new byte[3];
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			if (ch == S_BASE64PAD || ch < S_DECODETABLE.length
					&& S_DECODETABLE[ch] != Byte.MAX_VALUE) {
				ibuf[ibufcount++] = ch;
				if (ibufcount == ibuf.length) {
					ibufcount = 0;
					int obufcount = decode0(ibuf, obuf, 0);
					ostream.write(obuf, 0, obufcount);
				}
			}
		}
	}

	/**
	 * Returns base64 representation of specified byte array.
	 * 
	 * @param data
	 *            The data to be encoded
	 * @return The base64 encoded data
	 */
	public static String encode(byte[] data) {
		return encode(data, 0, data.length);
	}

	/**
	 * Returns base64 representation of specified byte array.
	 * 
	 * @param data
	 *            The data to be encoded
	 * @param off
	 *            The offset within the data at which to start encoding
	 * @param len
	 *            The length of the data to encode
	 * @return The base64 encoded data
	 */
	public static String encode(byte[] data, int off, int len) {
		if (len <= 0)
			return "";
		char[] out = new char[len / 3 * 4 + 4];
		int rindex = off;
		int windex = 0;
		int rest = len;
		while (rest >= 3) {
			int i = ((data[rindex] & 0xff) << 16)
					+ ((data[rindex + 1] & 0xff) << 8)
					+ (data[rindex + 2] & 0xff);
			out[windex++] = S_BASE64CHAR[i >> 18];
			out[windex++] = S_BASE64CHAR[(i >> 12) & 0x3f];
			out[windex++] = S_BASE64CHAR[(i >> 6) & 0x3f];
			out[windex++] = S_BASE64CHAR[i & 0x3f];
			rindex += 3;
			rest -= 3;
		}
		if (rest == 1) {
			int i = data[rindex] & 0xff;
			out[windex++] = S_BASE64CHAR[i >> 2];
			out[windex++] = S_BASE64CHAR[(i << 4) & 0x3f];
			out[windex++] = S_BASE64PAD;
			out[windex++] = S_BASE64PAD;
		} else if (rest == 2) {
			int i = ((data[rindex] & 0xff) << 8) + (data[rindex + 1] & 0xff);
			out[windex++] = S_BASE64CHAR[i >> 10];
			out[windex++] = S_BASE64CHAR[(i >> 4) & 0x3f];
			out[windex++] = S_BASE64CHAR[(i << 2) & 0x3f];
			out[windex++] = S_BASE64PAD;
		}
		return new String(out, 0, windex);
	}

	/**
	 * Outputs base64 representation of the specified byte array to a byte
	 * stream.
	 * 
	 * @param data
	 *            The data to be encoded
	 * @param off
	 *            The offset within the data at which to start encoding
	 * @param len
	 *            The length of the data to encode
	 * @param ostream
	 *            The OutputStream to which the encoded data should be written
	 */
	public static void encode(byte[] data, int off, int len,
			OutputStream ostream) throws IOException {
		if (len <= 0)
			return;
		byte[] out = new byte[4];
		int rindex = off;
		int rest = len;
		while (rest >= 3) {
			int i = ((data[rindex] & 0xff) << 16)
					+ ((data[rindex + 1] & 0xff) << 8)
					+ (data[rindex + 2] & 0xff);
			out[0] = (byte) S_BASE64CHAR[i >> 18];
			out[1] = (byte) S_BASE64CHAR[(i >> 12) & 0x3f];
			out[2] = (byte) S_BASE64CHAR[(i >> 6) & 0x3f];
			out[3] = (byte) S_BASE64CHAR[i & 0x3f];
			ostream.write(out, 0, 4);
			rindex += 3;
			rest -= 3;
		}
		if (rest == 1) {
			int i = data[rindex] & 0xff;
			out[0] = (byte) S_BASE64CHAR[i >> 2];
			out[1] = (byte) S_BASE64CHAR[(i << 4) & 0x3f];
			out[2] = (byte) S_BASE64PAD;
			out[3] = (byte) S_BASE64PAD;
			ostream.write(out, 0, 4);
		} else if (rest == 2) {
			int i = ((data[rindex] & 0xff) << 8) + (data[rindex + 1] & 0xff);
			out[0] = (byte) S_BASE64CHAR[i >> 10];
			out[1] = (byte) S_BASE64CHAR[(i >> 4) & 0x3f];
			out[2] = (byte) S_BASE64CHAR[(i << 2) & 0x3f];
			out[3] = (byte) S_BASE64PAD;
			ostream.write(out, 0, 4);
		}
	}

	/**
	 * Outputs base64 representation of the specified byte array to a character
	 * stream.
	 * 
	 * @param data
	 *            The data to be encoded
	 * @param off
	 *            The offset within the data at which to start encoding
	 * @param len
	 *            The length of the data to encode
	 * @param writer
	 *            The Writer to which the encoded data should be written
	 */
	public static void encode(byte[] data, int off, int len, Writer writer)
			throws IOException {
		if (len <= 0)
			return;
		char[] out = new char[4];
		int rindex = off;
		int rest = len;
		int output = 0;
		while (rest >= 3) {
			int i = ((data[rindex] & 0xff) << 16)
					+ ((data[rindex + 1] & 0xff) << 8)
					+ (data[rindex + 2] & 0xff);
			out[0] = S_BASE64CHAR[i >> 18];
			out[1] = S_BASE64CHAR[(i >> 12) & 0x3f];
			out[2] = S_BASE64CHAR[(i >> 6) & 0x3f];
			out[3] = S_BASE64CHAR[i & 0x3f];
			writer.write(out, 0, 4);
			rindex += 3;
			rest -= 3;
			output += 4;
			if (output % 76 == 0)
				writer.write("\n");
		}
		if (rest == 1) {
			int i = data[rindex] & 0xff;
			out[0] = S_BASE64CHAR[i >> 2];
			out[1] = S_BASE64CHAR[(i << 4) & 0x3f];
			out[2] = S_BASE64PAD;
			out[3] = S_BASE64PAD;
			writer.write(out, 0, 4);
		} else if (rest == 2) {
			int i = ((data[rindex] & 0xff) << 8) + (data[rindex + 1] & 0xff);
			out[0] = S_BASE64CHAR[i >> 10];
			out[1] = S_BASE64CHAR[(i >> 4) & 0x3f];
			out[2] = S_BASE64CHAR[(i << 2) & 0x3f];
			out[3] = S_BASE64PAD;
			writer.write(out, 0, 4);
		}
	}
}
