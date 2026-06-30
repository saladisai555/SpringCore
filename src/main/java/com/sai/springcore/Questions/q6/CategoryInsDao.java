package com.sai.springcore.Questions.q6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryInsDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void getJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public List<Prod_category> getProd_category(double price){
        String sql= """
                select p.pname,c.description from products p
                LEFT JOIN 
                category c on p.catcode=c.code 
                where LEN(p.pname) < 10
                AND p.price > ?
                """;
        return jdbcTemplate.query(sql,(rs,rowNum)->
                new Prod_category(
                        rs.getString("pname"),
                        rs.getString("description")
                ),price
        );
    }
}
