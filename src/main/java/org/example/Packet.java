package org.example;

import java.io.Serializable;

public class Packet implements Serializable {
    private byte sensortemperature ;
    private float gpsLongitude;
    private float gpsLatitude;
    private short checksum;
    private long idcarte;
    private long timeframe;

    public Packet(byte sensortemperature ,float gpsLongitude,float gpsLatitude ,short checksum ,long idcarte, long timeframe){
        this.sensortemperature =sensortemperature;
        this.gpsLatitude =gpsLatitude;
        this.gpsLongitude=gpsLongitude;
        this.idcarte=idcarte;
        this.timeframe=timeframe;
        this.checksum=checksum;
    }

    public Packet() {

    }

    public byte getSensortemperature() {
        return sensortemperature;
    }

    public void setSensortemperature(byte sensortemperature) {
        this.sensortemperature = sensortemperature;
    }

    public float getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(float gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }

    public float getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(float gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public short getChecksum() {
        return checksum;
    }

    public void setChecksum(short checksum) {
        this.checksum = checksum;
    }

    public long getIdcarte() {
        return idcarte;
    }

    public void setIdcarte(long idcarte) {
        this.idcarte = idcarte;
    }

    public long getTimeframe() {
        return timeframe;
    }

    public void setTimeframe(long timeframe) {
        this.timeframe = timeframe;
    }
}
