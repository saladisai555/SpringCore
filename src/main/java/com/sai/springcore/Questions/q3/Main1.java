package com.sai.springcore.Questions.q3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Main1 implements CommandLineRunner {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductDao1 productDao1;
    public static void main(String[] args) {
        SpringApplication.run(Main1.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println(productDao.getAveragePrice());
        System.out.println(productDao1.getAveragePrice());

    }
}