package com.example.customer.service;

import java.util.List;

import com.example.customer.model.Customer;
import com.example.customer.vo.CustomerVO;

public interface CustomerService {

	public boolean insertEmployee(CustomerVO customer);
	
	public boolean updateEmployee(CustomerVO customer);
	
	public Customer getEmployee(String customerId);
	
	public List<Customer> getAllEmployee();
	
}
