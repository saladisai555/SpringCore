package com.sai.springcore.Questions.q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImp implements ProductDao{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    @Override
    public Double getAveragePrice() {
        String sql="SELECT AVG(price) from products";
        return jdbcTemplate.queryForObject(sql,Double.class);
    }
}
