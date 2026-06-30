package com.sai.springcore.Questions.q6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {
    private final CategoryInsDao categoryInsDao;
    public Main(CategoryInsDao categoryInsDao){
        this.categoryInsDao=categoryInsDao;
    }
    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        List<Prod_category> l=categoryInsDao.getProd_category(3000);
        for(Prod_category p:l){
            System.out.println(p.getProd_name());
            System.out.println(p.getCat_desc());
        }
    }
}
