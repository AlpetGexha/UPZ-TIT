package TCP;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) {
        String serverAddress = "192.168.56.101";
        int serverPort = 5050;

        try (Socket socket = new Socket(serverAddress, serverPort);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true);
             BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to server. Type a message ('exit' to quit):");

            while (true) {
                System.out.print("You: ");
                String userInput = scanner.nextLine(); // Get input from user

                if ("exit".equalsIgnoreCase(userInput)) {
                    System.out.println("Closing connection...");
                    break;
                }

                output.println(userInput); // Send message to server

                String response = input.readLine(); // Read server response
                if (response == null) {
                    System.out.println("Server disconnected.");
                    break;
                }

                System.out.println("Server says: " + response);
            }

        } catch (IOException e) {
            System.err.println("Connection error: " + e.getMessage());
        }
    }
}
