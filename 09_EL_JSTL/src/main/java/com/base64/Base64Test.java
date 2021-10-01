package com.base64;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class Base64Test {
    public static void main(String[] args) throws Exception {
        String content = "这是需要Base64编码的内容";
        BASE64Encoder base64Encoder = new BASE64Encoder();


            String encodeString = base64Encoder.encode(content.getBytes("UTF-8"));

            System.out.println(encodeString);


        BASE64Decoder base64Decoder = new BASE64Decoder();
        byte[] bytes = base64Decoder.decodeBuffer(encodeString);

        String s = new String(bytes, "UTF-8");
        System.out.println(s);
    }
}
