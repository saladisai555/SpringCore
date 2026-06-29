package com.sai.springcore.Questions.q5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryInsDao {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public void getJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate=jdbcTemplate;
    }

    public int insert(String code,String description){
        String sql= """
                insert into category
                values(?,?)
                """;
        return jdbcTemplate.update(sql,code,description);
    }
}
