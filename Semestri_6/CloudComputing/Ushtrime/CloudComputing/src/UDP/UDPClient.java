package UDP;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) {
        int port = 1000;
        int sentToPort = 5150;

        try {

            DatagramSocket ds = new DatagramSocket(port);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter a number: ");
            String str = br.readLine();

            byte[] b = str.getBytes();
            DatagramPacket dp = new DatagramPacket(b, b.length, InetAddress.getLocalHost(), sentToPort);

            ds.send(dp);

            byte[] b1 = new byte[1024];
            DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
            ds.receive(dp1);

            String str1 = new String(dp1.getData(), 0, dp1.getLength());
            System.out.println("Server: " + str1);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
