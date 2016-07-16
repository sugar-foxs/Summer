package com.guchunhui.service;

import com.guchunhui.model.Customer;

import java.util.List;

/**
 * Created by gch on 16-4-13.
 */
public interface CustomerService {
     Customer findCustomerById(long id);
     List<Customer> findAllCustomers();
     void insertCustomer(Customer customer);
     void deleteCustomerById(long id);
}
