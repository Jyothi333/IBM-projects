package com.ibm.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ibm.bean.CustomerBean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerImpl implements Customer{
        
    // List<CustomerBean> customers = Arrays.asList()  
    //     new CustomerBean(1,"Alpha","LOC1",10001,"01/01/1999"),
    //     new CustomerBean(2,"Bravo","LOC2",10002,"02/02/2000"),
    //     new CustomerBean(3,"Charlie","LOC3",10003,"03/03/2001"),
    //     new CustomerBean(4,"Delta","LOC4",10004,"04/04/2002")
    //     );
    List<CustomerBean> customers = new ArrayList<>(Arrays.asList(
    		new CustomerBean(1,"Dhoni","Chennai",30001,"01/01/1999"),
	        new CustomerBean(2,"Virat","Banglore",30002,"02/02/2000"),
	        new CustomerBean(3,"K.L Rahul","Lucknow",30003,"03/03/2001"),
	        new CustomerBean(4,"Rishab","Delhi",30004,"04/04/2002")
    		));
        @Override
        public void createCustomer(int id,String name,String address,int pin,String dob) {
             for(CustomerBean customer:customers) {
                 if(customer.getCustomerId()==id) {
                     System.out.println("Customer already exists");
                     return;
                 }
                 else {
                     // CustomerBean newCustomer = new CustomerBean(id,name,address,pin,dob);
                     customers.add(new CustomerBean(id,name,address,pin,dob));
                     System.out.println("Customer created successfully");
                     return;
                 }
             }
            
         }

        @Override
        public void updateCustomer(int id,String name,String address,int pin,String dob) {
            if(id>0) {
                for(CustomerBean customer:customers) {
                    if(customer.getCustomerId()==id) {
                        customer.setCustomerName(name);
                        customer.setCustomerAddress(address);
                        customer.setCustomerpin(pin);
                        customer.setDob(dob);
                        System.out.println("Customer updated");
                    }
                    
                }
            }
        }
        @Override
        public void deleteCustomer(int id) {
            if(id>0) {
                for(CustomerBean customer:customers) {
                    if(customer.getCustomerId()==id) {
//                        customers.removeIf(obj->obj.getCustomerId().equals(id));
                    	customers.remove(customer);
                        System.out.println("Customer deleted");
                        break;
                    }
                }
            }
        }
        @Override
        public void listCustomer() {
            System.out.println("Customer listed");
            System.out.println(customers);
            for(CustomerBean customer: customers){
            	
                System.out.println("Details:"+customer.getCustomerId()+" "+customer.getCustomerName()+" "+customer.getCustomerAddress()+" "+customer.getCustomerpin()+" "+customer.getDob());
            }
        }
}