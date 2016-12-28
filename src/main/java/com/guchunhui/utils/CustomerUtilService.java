package com.guchunhui.utils;

import com.guchunhui.model.Customer;
import com.guchunhui.model.ShoppingCar;
import com.guchunhui.service.CustomerService;
import com.guchunhui.service.ShoppingCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gch on 16-11-17.
 */
@Service("customerUtilServcie")
public class CustomerUtilService {
    @Autowired
    private CustomerService customerService;

    @Autowired
    private ShoppingCarService shoppingCarService;

    @Autowired
    private MD5Service md5Service;

    public void registerCustomer(Customer customer){
        String password = customer.getCustomerPassword();
        String newpas = md5Service.EncoderByMd5(password);
        customer.setCustomerPassword(newpas);
        customerService.insertCustomer(customer);
        Customer customer1 = customerService.findCustomerByName(customer.getCustomerName());
        ShoppingCar shoppingCar = new ShoppingCar();
        shoppingCar.setCustomerId(customer1.getCustomerId());
        shoppingCarService.insertShoppingCar(shoppingCar);
    }
}
