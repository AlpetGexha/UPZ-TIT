package TCP.LiveChat;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 5060;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                new ClientHandler(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}