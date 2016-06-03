package com.guchunhui.service;

import com.guchunhui.model.Customer;

import java.util.List;

/**
 * Created by gch on 16-4-13.
 */
public interface CustomerService {
    public Customer findCustomerById(int id);
    public List<Customer> findAllCustomers();
    public void insertCustomer(Customer customer);
    public void deleteCustomerById(int id);
}
