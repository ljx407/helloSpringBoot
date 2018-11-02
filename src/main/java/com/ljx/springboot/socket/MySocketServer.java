package com.ljx.springboot.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: jasonliu
 * @Date: 2018/10/29 23:15
 * @Description:
 */
public class MySocketServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null ;
        Socket accept = null ;
        InputStream inputStream = null ;
        InputStreamReader inputStreamReader = null ;
        BufferedReader bufferedReader = null ;

        OutputStream outputStream = null ;
        OutputStreamWriter outputStreamWriter = null ;
        BufferedWriter bufferedWriter = null ;
        try {
            serverSocket = new ServerSocket(10086);
            accept = serverSocket.accept();
            inputStream = accept.getInputStream();
            inputStreamReader = new InputStreamReader(inputStream);
            bufferedReader = new BufferedReader(inputStreamReader);

            String line ;
            StringBuilder sb = new StringBuilder();
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line);
                System.out.println(line);
            }

            accept.shutdownInput();

            String returnData = sb.toString() + " I'm the service，I accept your data!";

            outputStream = accept.getOutputStream();
            outputStreamWriter = new OutputStreamWriter(outputStream);
            bufferedWriter = new BufferedWriter(outputStreamWriter);
            bufferedWriter.write(returnData);
            bufferedWriter.flush();

            accept.shutdownOutput();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                bufferedReader.close();
                inputStreamReader.close();
                inputStream.close();
                accept.close();

                bufferedWriter.close();
                outputStreamWriter.close();
                outputStream.close();
                serverSocket.close();
            }catch (Exception e) {

            }

        }
    }
}
