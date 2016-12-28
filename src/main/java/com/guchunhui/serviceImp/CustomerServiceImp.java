package com.guchunhui.serviceImp;

import com.guchunhui.dao.CustomerMapper;
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

    @Autowired
    private CustomerMapper customerMapper;


    public void insertCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerMapper.findAllCustomers();
    }

    public void deleteCustomerById(long id) {
        customerMapper.deleteCustomerById(id);
    }

    public Customer findCustomerByName(String name) {
        return customerMapper.findCustomerByName(name);
    }


    public Customer findCustomerById(long id){
        return customerMapper.findCustomerById(id);
    }
}
