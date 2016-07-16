package com.guchunhui.service;

import com.guchunhui.model.Customer;
import com.guchunhui.model.CustomerCarAndList;

/**
 * Created by gch on 16-7-16.
 */
public interface CustomerCarAndListService {
    void insertCustomerCarAndList(CustomerCarAndList customerCarAndList);
    void deleteCarAndListById(long id);
    CustomerCarAndList findCustomerCarAndListById(long id);

}
