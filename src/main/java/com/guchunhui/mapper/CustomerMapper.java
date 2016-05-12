package com.guchunhui.mapper;

import com.guchunhui.model.Customer;

/**
 * Created by gch on 16-5-12.
 */
public interface CustomerMapper {
    public void insertCustomer(Customer customer);
    public Customer findCustomerById(int id);
}
