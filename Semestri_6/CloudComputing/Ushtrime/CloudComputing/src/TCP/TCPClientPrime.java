package TCP;

import java.net.*;
import java.io.*;

public class TCPClientPrime {

    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 8001);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());
            DataInputStream in = new DataInputStream(s.getInputStream());

            while (true) {
                System.out.printf("Enter a number: ");
                int x = Integer.parseInt(br.readLine());
                out.writeInt(x);
                System.out.println(in.readUTF());
            }

        } catch (Exception e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }
}