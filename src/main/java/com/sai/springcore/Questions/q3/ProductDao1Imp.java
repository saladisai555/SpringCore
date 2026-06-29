package com.sai.springcore.Questions.q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDao1Imp implements ProductDao1 {

    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public List<Object[]> getAveragePrice(){
        String sql="SELECT pname,AVG(price) from products GROUP BY pname";
        return jdbcTemplate.query(sql,(rs, rowNum) -> new Object[]{
                rs.getString(1),
                rs.getInt(2)
        });
    }


}
