package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
    public static void main(String[] args) {
        int port = 5150;

        try {

            DatagramSocket ds = new DatagramSocket(port);
            byte[] b = new byte[1024];

            DatagramPacket dp = new DatagramPacket(b, b.length);

            while (true) {
                ds.receive(dp);
                String str = new String(dp.getData(), 0, dp.getLength());
                System.out.println("Client: " + str);

                int x = Integer.parseInt(str);
//                int fact = factorial(x);

                String response = isEven(x) ? "Even" : "Odd";

                byte[] b1 = String.valueOf(response).getBytes();


                DatagramPacket dp1 = new DatagramPacket(b1, b1.length, dp.getAddress(), dp.getPort());



                ds.send(dp1);

            }


        } catch (Exception e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
