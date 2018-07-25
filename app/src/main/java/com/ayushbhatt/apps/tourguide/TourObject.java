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

    //rating bar stars count for food places list from Google Maps
    private Double tObjectRatings;

    //type of the object, whether it's a food type or music type
    private String tObjectType;

    //default constructor
    public TourObject(String objectName, int objectImageResourceID, String objectAddress, String objectPhoneNumber, String objectWebsite) {
        tObjectName = objectName;
        tObjectImageResourceID = objectImageResourceID;
        tObjectAddress = objectAddress;
        tObjectPhoneNumber = objectPhoneNumber;
        tObjectWebsite = objectWebsite;
    }

    //constructor for objects with ratings and type
    public TourObject(String objectName, int objectImageResourceID, String objectAddress, String objectPhoneNumber, String objectWebsite, Double objectRatings, String objectType) {
        tObjectName = objectName;
        tObjectImageResourceID = objectImageResourceID;
        tObjectAddress = objectAddress;
        tObjectPhoneNumber = objectPhoneNumber;
        tObjectWebsite = objectWebsite;
        tObjectRatings = objectRatings;
        tObjectType = objectType;
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

    public String getObjectType() {
        return tObjectType;
    }

    public Double getObjectRatings() {
        return tObjectRatings;
    }
}
