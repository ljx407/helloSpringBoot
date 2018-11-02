package com.ljx.springboot.socket;

import java.io.*;
import java.net.Socket;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/29 23:28
 * @Description:
 */
public class MySocketClient {
    public static void main(String[] args) {
        Socket socket = null ;
        OutputStream outputStream = null ;
        OutputStreamWriter outputStreamWriter = null ;
        BufferedWriter bufferedWriter = null ;

        InputStream inputStream = null ;
        InputStreamReader inputStreamReader = null ;
        BufferedReader bufferedReader = null ;
        try {
            String sayHello = "jsaonliu!";
            socket = new Socket("127.0.0.1",10086);
            outputStream = socket.getOutputStream();
            outputStreamWriter = new OutputStreamWriter(outputStream);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(sayHello);
            bufferedWriter.flush();

            socket.shutdownOutput();

            inputStream = socket.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            String line ;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            socket.shutdownInput();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                outputStreamWriter.close();
                outputStream.close();

                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
                socket.close();
            }catch (Exception e) {

            }
        }
    }
}
