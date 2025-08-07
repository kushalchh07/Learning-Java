// TCPClient.java
import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        String serverIP = "localhost"; // Or the server's IP address
        int port = 1234;

        try (Socket socket = new Socket(serverIP, port)) {
            // Send message to server
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.println("Hello from Client!");

            // Read server response
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String reply = in.readLine();
            System.out.println("Server says: " + reply);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
