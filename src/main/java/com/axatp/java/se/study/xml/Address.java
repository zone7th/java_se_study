package com.axatp.java.se.study.xml;

public class Address {
    private String addType;
    private String place;

    public Address(String addType, String place) {
        this.addType = addType;
        this.place = place;
    }
    
    
    public Address() {
        super();
    }


    public String getAddType() {
        return addType;
    }

    public void setAddType(String addType) {
        this.addType = addType;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }


    public String toString() {
        return "Address{" +
                "addType='" + addType + '\'' +
                ", place='" + place + '\'' +
                "}\n";
    } 
}
