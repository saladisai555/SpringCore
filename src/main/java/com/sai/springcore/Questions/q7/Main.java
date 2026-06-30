package com.sai.springcore.Questions.q7;

import com.sai.springcore.Questions.q7.Entity.Products;
import com.sai.springcore.Questions.q7.Entity.Sales;
import com.sai.springcore.Questions.q7.Repositories.ProductRepository;
import com.sai.springcore.Questions.q7.Repositories.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@SpringBootApplication
public class Main implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private SalesRepository repo;
    public static void main(String[] args){
        SpringApplication.run(Main.class,args);
    }
    @Override
    public void run(String... args) throws Exception {
        Products p=new Products("Laptop",10000);
        productRepository.save(p);
        repo.save(new Sales(5, 55000, p));
        repo.save(new Sales(10, 58000, p));
        repo.save(new Sales(15, 61000, p));
        repo.save(new Sales(20, 50000, p));
        repo.save(new Sales(25, 52000, p));
        repo.save(new Sales(30, 59000, p));
        //q1
        List<Sales> s1=repo.findByProductName("Laptop");
        s1.forEach(System.out::println);
        //q2
        List<Sales> s2=repo.findByQuantityBetween(1,10);
        s2.forEach(System.out::println);
        //q3
         List<Sales> s3=repo.findAllByOrderByQuantityAsc();
         s3.forEach(System.out::println);
         //q4
        List<Sales> s4=repo.findSalesWithLowerPrice();
        s4.forEach(System.out::println);
        //q5
        Page<Sales> page=repo.findAll(PageRequest.of(2,4));
        page.getContent().forEach(System.out::println);
    }
}
