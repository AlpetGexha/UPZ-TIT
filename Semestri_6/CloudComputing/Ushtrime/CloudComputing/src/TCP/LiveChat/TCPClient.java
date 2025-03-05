package TCP.LiveChat;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
//        String serverAddress = "192.168.58.101"; // Kali Linux
//        String serverAddress = "192.168.58.102"; // Ubuntu

        int serverPort = 5060;

        try (Socket socket = new Socket(serverAddress, serverPort);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to server. Type a message ('exit' to quit):");

            Thread sendThread = new Thread(() -> {
                while (true) {
                    System.out.print("You: ");
                    String userInput = scanner.nextLine();
                    if ("exit".equalsIgnoreCase(userInput)) {
                        System.out.println("Closing connection...");
                        try {
                            socket.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        break;
                    }
                    output.println(userInput);
                }
            });

            sendThread.start();

            String serverMessage;
            while ((serverMessage = input.readLine()) != null) {
                System.out.println("Server: " + serverMessage);
            }
        } catch (IOException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
    }

}