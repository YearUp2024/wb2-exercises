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
    
    public void phoneSerialNumber(){
        System.out.println(this.serialNumber);
    }

    public void phoneModel(){
        System.out.println(this.model);
    }

    public void phoneCarrier(){
        System.out.println(this.carrier);
    }

    public void phoneNumber(){
        System.out.println(this.phoneNumber);
    }

    public void phoneOwner(){
        System.out.println(this.owner);
    }
}
