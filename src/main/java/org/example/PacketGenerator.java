package org.example;

import java.io.Serializable;
import java.util.Random;

public class PacketGenerator implements Serializable {

    public static byte generateRandomByte(){
        Random random = new Random();
        byte randomByte = (byte) random.nextInt(256);
        return randomByte;
    }
    public static float generateRandomFloat(){
        Random random = new Random();
        float randomFloat = (float) random.nextFloat();
        return randomFloat;
    }
    public static long generateRandomLong() {
        Random random = new Random();
        long randomLong = random.nextLong();
        return randomLong;
    }
    public Packet generatePacket(long id){
        Packet packet = new Packet();
        packet.setIdcarte(id);
        packet.setGpsLatitude(generateRandomFloat());
        packet.setGpsLongitude(generateRandomFloat());
        packet.setSensortemperature(generateRandomByte());
        packet.setTimeframe(generateRandomLong());

       // packet.getChecksum();

        return packet;
    }

}
