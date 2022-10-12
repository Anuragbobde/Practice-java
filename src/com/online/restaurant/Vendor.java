package com.online.restaurant;

public class Vendor {
    private Long vendorid;
    private String name;

    public Long getVendorid() {
        return vendorid;
    }

    public void setVendorid(Long vendorid) {
        this.vendorid = vendorid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isPureVeg() {
        return pureVeg;
    }

    public void setPureVeg(boolean pureVeg) {
        this.pureVeg = pureVeg;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private String address;
    private Long phoneNumber;
    private String emailid;
    private String city;
    private String state;
    private boolean pureVeg;
    private String category;
    private double rating;

}
