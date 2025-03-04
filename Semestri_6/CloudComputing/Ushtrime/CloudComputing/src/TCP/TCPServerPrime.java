package TCP;

import java.net.*;
import java.io.*;

public class TCPServerPrime {
    public static void main(String[] args) {

        try {

            ServerSocket ss = new ServerSocket(8001);


            Socket s = ss.accept();

            DataInputStream in = new DataInputStream(s.getInputStream());

            int x = in.readInt();

            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            if(isEven(x))
                out.writeUTF("The number is even.");
            else
                out.writeUTF("The number is odd.");

        } catch (Exception e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }


}
