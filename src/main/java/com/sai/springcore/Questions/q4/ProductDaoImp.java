package com.sai.springcore.Questions.q4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImp implements Productdao{
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void getJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }
    @Override
    public List<CategoryAvg> getCategoryAvg() {
          String sql= """
                  select catcode,AVG(price) as avgprice from products
                  group by
                  catcode
                 """;
          return jdbcTemplate.query(sql,(rs,rowNum)->
                  new CategoryAvg(
                          rs.getString("catcode"),
                          rs.getDouble("avgprice")
                  ));
    }
}
