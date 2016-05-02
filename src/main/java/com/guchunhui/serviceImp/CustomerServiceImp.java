package com.guchunhui.serviceImp;

import com.guchunhui.model.Customer;
import com.guchunhui.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;


/**
 * Created by gch on 16-4-13.
 */
public class CustomerServiceImp implements CustomerService {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Customer findCustomerById(int id) {
        String sql = "select * from customer where customer_id=?";
        return (Customer) jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper(Customer.class));
    }

    public void insertCustomer(Customer customer) {
        String sql="insert into customer(customer_id,customer_name) values(?,?)";
        jdbcTemplate.update(sql,new Object[]{
                customer.getCustomerId(),customer.getCustomerName()
        });
    }

    public List<Customer> findAllCustomers() {
        String sql = "select * from customer ";
        return (List<Customer>) jdbcTemplate.query(sql, new BeanPropertyRowMapper(Customer.class));
    }

    public void delete(int id) {
        String sql = "delete from customer where customer_id=?";
        this.jdbcTemplate.update(sql,id);
    }


}
