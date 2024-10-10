package org.example;

public class Main {
    public static void main(String[] args) {
        PacketGenerator pg = new PacketGenerator();
        Packet p =  pg.generatePacket(1142554855);
        System.out.println(p.getGpsLatitude());
        System.out.println(p.getGpsLongitude());
        System.out.println(p.getIdcarte());
        System.out.println(p.getSensortemperature());
        System.out.println(p.getTimeframe());
        System.out.println(p.getChecksum());
    }
}