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
    private String tObjectRatings;

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
    public TourObject(String objectName, String objectAddress, String objectPhoneNumber, String objectWebsite, String objectRatings, String objectType) {
        tObjectName = objectName;
        tObjectAddress = objectAddress;
        tObjectPhoneNumber = objectPhoneNumber;
        tObjectWebsite = objectWebsite;
        tObjectRatings = objectRatings;
        tObjectType = objectType;
    }

    //constructor for objects with name, website and type
    public TourObject(String objectName, String objectWebsite, String objectType) {
        tObjectName = objectName;
        tObjectWebsite = objectWebsite;
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

    public String getObjectRatings() {
        return tObjectRatings;
    }
}
