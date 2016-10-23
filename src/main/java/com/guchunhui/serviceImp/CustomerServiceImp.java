package com.guchunhui.serviceImp;

import com.guchunhui.mapper.CustomerMapper;
import com.guchunhui.mapper.ShoppingCarMapper;
import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
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

    public Customer findCustomerByName(String customerName) { return customerMapper.findCustomerByName(customerName); }

    public void insertCustomer(Customer customer) {
        customerMapper.insertCustomer(customer);
    }

    public List<Customer> findAllCustomers() {
        return customerMapper.findAllCustomers();
    }

    public void deleteCustomerById(long costomerId) {
        customerMapper.deleteCustomerById(costomerId);
    }

    public Customer findCustomerById(long costomerId){
        return customerMapper.findCustomerById(costomerId);
    }

    public CustomerMapper getCustomerMapper(){return customerMapper;}

    @Autowired
    public void setCustomerMapper(CustomerMapper customerMapper) {
        this.customerMapper = customerMapper;
    }
}
