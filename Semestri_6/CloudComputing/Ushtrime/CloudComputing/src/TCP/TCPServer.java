package TCP;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        int port = 5050; // Port must match the port in VirtualBox forwarding

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                String message;
                while ((message = input.readLine()) != null) {
                    System.out.println("Received: " + message);
                    output.println("Server received: " + message); // Send response
                }

                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
