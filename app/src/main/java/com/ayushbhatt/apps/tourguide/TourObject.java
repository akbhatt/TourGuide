package com.ayushbhatt.apps.tourguide;

public class TourObject {

    //name of any object that is attraction, food place, etc. that is used in this app
    private String tObjectName;

    //id of any object that is attraction, food place, etc. that is used in this app
    private int tObjectImageResourceID;

    //address of any object that is attraction, food place, etc. that is used in this app
    private String tObjectAddress;

    //phone number of any object that is attraction, food place, etc. that is used in this app
    private String tObjectPhoneNumber;

    //website of any object that is attraction, food place, etc. that is used in this app
    private String tObjectWebsite;

    //default constructor
    public TourObject(String objectName, int objectImageResourceID, String objectAddress, String objectPhoneNumber, String objectWebsite) {
        tObjectName = objectName;
        tObjectImageResourceID = objectImageResourceID;
        tObjectAddress = objectAddress;
        tObjectPhoneNumber = objectPhoneNumber;
        tObjectWebsite = objectWebsite;
    }

    //all the get methods

    public String getObjectName() {
        return tObjectName;
    }

    public int getObjectImageResourceID() {
        return tObjectImageResourceID;
    }

    public String getObjectAddress() {
        return tObjectAddress;
    }

    public String getObjectPhoneNumber() {
        return tObjectPhoneNumber;
    }

    public String getObjectWebsite() {
        return tObjectWebsite;
    }
}
