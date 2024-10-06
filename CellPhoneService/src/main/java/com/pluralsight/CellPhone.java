package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }

    public int getSerialNumber(){
        return serialNumber;
    }

    public String getModel(){
        return model;
    }

    public String getCarrier(){
        return carrier;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getOwner(){
        return owner;
    }
}
