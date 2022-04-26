package com.ibm.service;


public interface Customer {
    
    public void createCustomer(int id, String name, String address, int pin, String dob);
    public void updateCustomer(int id, String name, String address, int pin, String dob);
    public void deleteCustomer(int id);
    public void listCustomer();
}
// 1. createCustomer()
// 2. updateCustomer()
// 3. listCustomer()
// 4. deleteCustomer()