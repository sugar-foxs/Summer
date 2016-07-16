package com.guchunhui.mapper;

import com.guchunhui.model.CustomerCarAndList;

/**
 * Created by gch on 16-7-16.
 */
public interface CustomerCarAndListMapper {
    void insertCustomerCarAndList(CustomerCarAndList customerCarAndList);
    void deleteCarAndListById(long id);
    CustomerCarAndList findCustomerCarAndListById(long id);
}
