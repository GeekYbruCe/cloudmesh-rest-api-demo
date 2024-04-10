package com.net.restdemo.model;

public class CloudMesh {
    private String vendorId;
    private String vendorAddress;
    private String vendorPhoneNumber;
    private String vendorName;

    public CloudMesh() {

    }


    public CloudMesh(String vendorId, String vendorAddress, String vendorPhoneNumber, String vendorName) {
        this.vendorId = vendorId;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNumber = vendorPhoneNumber;
        this.vendorName = vendorName;

    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNumber() {
        return vendorPhoneNumber;
    }

    public void setVendorPhoneNumber(String vendorPhoneNumber) {
        this.vendorPhoneNumber = vendorPhoneNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

}