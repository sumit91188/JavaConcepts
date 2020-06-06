package com.deo.ex1;

import java.io.*;
import java.net.Socket;

/**
 * @author Sumit Deo
 */
public class ClientApp {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 8080);
        OutputStream outputStream = socket.getOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));

        InputStream inputStream = socket.getInputStream();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(inputStream));

        while (true) {
            String data1 = reader1.readLine();
            printStream.println(data1);
            String data2 = reader2.readLine();
            System.out.println(data2);

            if (data1.equalsIgnoreCase("bye") || data2.equalsIgnoreCase("bye")) {
                System.exit(0);
            }
        }
    }
}
