package org.example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Packet packet = receivePacket();
            displayPacket(packet);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Packet receivePacket() throws Exception {
        try (Socket socket = new Socket("localhost", 3333);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream())) {

            System.out.println("Connected to Server");

            objectOutputStream.writeObject("i m ready to receive");

            Packet packet = (Packet) objectInputStream.readObject();

            return packet;

        } catch (IOException e) {
            throw new RuntimeException("Error in receiving packet", e);
        }
    }

    private static void displayPacket(Packet packet) {
        System.out.println("Received Packet:");
        System.out.println("Id: " + packet.getIdcarte());
        System.out.println("Time Frame: " + packet.getTimeframe());
        System.out.println("Temp Sensor: " + packet.getSensortemperature());
        System.out.println("Longitude: " + packet.getGpsLongitude());
        System.out.println("Latitude: " + packet.getGpsLatitude());
        System.out.println("Checksum: " + packet.getChecksum());
    }
}
