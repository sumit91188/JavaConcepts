package com.deo.ex1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Sumit Deo
 */
public class ServerApp {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8080);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String data1 = reader1.readLine();
            System.out.println(data1);
            String data2 = reader2.readLine();
            printStream.println(data2);

            if (data1.equalsIgnoreCase("bye") || data2.equalsIgnoreCase("bye")) {
                System.exit(0);
            }
        }
    }
}
