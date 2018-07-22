package com.ayushbhatt.apps.tourguide;

public class AttractionInfo {

    //name of the attraction
    private String attractionName;

    //id of the image
    private int attractionImageResourceID;

    //address of the attraction
    private String attractionAddress;

    //phone number of the attraction
    private String attractionPhoneNumber;

    //website of the attraction
    private String attractionWebsite;

    //default constructor
    public AttractionInfo(String attName, int attImageResourceID, String attAddress, String attPhoneNumber, String attWebsite) {
        attractionName = attName;
        attractionImageResourceID = attImageResourceID;
        attractionAddress = attAddress;
        attractionPhoneNumber = attPhoneNumber;
        attractionWebsite = attWebsite;
    }

    //all the get methods

    public String getAttractionName() {
        return attractionName;
    }

    public int getAttractionImageResourceID() {
        return attractionImageResourceID;
    }

    public String getAttractionAddress() {
        return attractionAddress;
    }

    public String getAttractionPhoneNumber() {
        return attractionPhoneNumber;
    }

    public String getAttractionWebsite() {
        return attractionWebsite;
    }
}
