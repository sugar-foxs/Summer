package com.guchunhui.mapper;

import com.guchunhui.model.Customer;

import java.util.List;

/**
 * Created by gch on 16-5-12.
 */
public interface CustomerMapper {
     void insertCustomer(Customer customer);
     Customer findCustomerById(long id);
     void deleteCustomerById(long id);
     List<Customer> findAllCustomers();
}
