package com.guchunhui.mapper;

import com.guchunhui.model.Customer;

import java.util.List;

/**
 * Created by gch on 16-5-12.
 */
public interface CustomerMapper {
    public void insertCustomer(Customer customer);
    public Customer findCustomerById(int id);
    public void deleteCustomerById(int id);
    public List<Customer> findAllCustomers();
}
