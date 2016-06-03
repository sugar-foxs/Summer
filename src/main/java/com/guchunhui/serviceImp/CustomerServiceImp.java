package com.guchunhui.serviceImp;

import com.guchunhui.mapper.CustomerMapper;
import com.guchunhui.model.Customer;
import com.guchunhui.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by gch on 16-4-13.
 */
@Service("customerService")
public class CustomerServiceImp implements CustomerService {
    private CustomerMapper customerMapper;

    public void insertCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerMapper.findAllCustomers();
    }

    public void deleteCustomerById(int id) {
        customerMapper.deleteCustomerById(id);
    }

    public Customer findCustomerById(int id){
        return customerMapper.findCustomerById(id);
    }


    @Autowired
    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }
}
