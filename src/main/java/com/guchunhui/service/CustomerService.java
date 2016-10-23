package com.guchunhui.service;

import com.guchunhui.model.Customer;

import java.util.List;

/**
 * Created by gch on 16-4-13.
 */
public interface CustomerService {
    public Customer findCustomerById(long customerId);
    public Customer findCustomerByName(String customerName);
    public List<Customer> findAllCustomers();
    public void insertCustomer(Customer customer);
    public void deleteCustomerById(long customerId);
}
