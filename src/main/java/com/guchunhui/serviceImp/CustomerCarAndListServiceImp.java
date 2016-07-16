package com.guchunhui.serviceImp;

import com.guchunhui.mapper.CustomerCarAndListMapper;
import com.guchunhui.model.Customer;
import com.guchunhui.model.CustomerCarAndList;
import com.guchunhui.service.CustomerCarAndListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gch on 16-7-16.
 */
@Service("customerCarAndListService")
public class CustomerCarAndListServiceImp implements CustomerCarAndListService {
    private CustomerCarAndListMapper customerCarAndListMapper;

    @Autowired
    public void setCustomerCarAndListMapper(CustomerCarAndListMapper customerCarAndListMapper) {
        this.customerCarAndListMapper = customerCarAndListMapper;
    }


    public void insertCustomerCarAndList(CustomerCarAndList customerCarAndList) {
        customerCarAndListMapper.insertCustomerCarAndList(customerCarAndList);
    }

    public void deleteCarAndListById(long id) {
        customerCarAndListMapper.deleteCarAndListById(id);
    }

    public CustomerCarAndList findCustomerCarAndListById(long id) {
        return customerCarAndListMapper.findCustomerCarAndListById(id);
    }
}
