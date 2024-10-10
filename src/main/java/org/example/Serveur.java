package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Serveur {
    public static void main(String[] args) {
        try {
            startServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startServer() throws Exception {
        try (ServerSocket serverSocket = new ServerSocket(3333);
             Socket socket = serverSocket.accept();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream())) {

            System.out.println("Server started...");
            System.out.println("Client connected: " + socket.getLocalPort());

            PacketGenerator pg = new PacketGenerator();
            Packet packet = pg.generatePacket(12354258);

            objectInputStream.readObject();

            System.out.println("The client is ready, the packet will be sent now ...");

            objectOutputStream.writeObject(packet);
            System.out.println("Packet sent to client.");

        } catch (IOException e) {
            throw new RuntimeException("Error in starting server", e);
        }
    }
}
