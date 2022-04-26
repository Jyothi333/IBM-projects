package com.ibm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ibm.bean.EmployeeBean;

@Service
public class EmployeeImpl implements Employee{
	
	List<EmployeeBean> employee = new ArrayList<EmployeeBean>();
	@Override
	public void createEmployee() {
		EmployeeBean bean = new EmployeeBean();
		bean.setEmployeeId(101);
		bean.setEmployeeName("MSD");
		bean.setAddress("Chennai");
		bean.setLocation("India");
		
		EmployeeBean bean1 = new EmployeeBean();
		bean1.setEmployeeId(102);
		bean1.setEmployeeName("VIRAT");
		bean1.setAddress("Banglore");
		bean1.setLocation("India");
		
		employee.add(bean);
		employee.add(bean1);
	}
	@Override
	public void listEmployee() {
		System.out.println("Employee list:");
		System.out.println(employee);
		for(EmployeeBean emp: employee) {
			System.out.println("Details:"+emp.getEmployeeId()+" "+emp.getEmployeeName()+ " "
					+emp.getAddress()+" "+emp.getLocation());
		}
	}
	
}
