package com.ibm.bean;

public class CustomerBean {
    private int customerId;
    private String customerName;
    private String customerAddress;
    private int customerpin;
    private String dob;

    public CustomerBean(int i, String string, String string2, int j, String string3) {
        this.customerId = i;
        this.customerName = string;
        this.customerAddress = string2;
        this.customerpin = j;
        this.dob = string3;
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public int getCustomerpin() {
        return customerpin;
    }
    public void setCustomerpin(int customerpin) {
        this.customerpin = customerpin;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
}
