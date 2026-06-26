package com.sai.springcore.Questions.q2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {
     @Autowired
     private PaymentService paymentService;
     public static void main(String[] args){
         SpringApplication.run(Main.class,args);
     }
    @Override
    public void run(String... args) throws Exception {
        paymentService.processPayment();
        paymentService.validateCC();
        String msg=paymentService.process();
        System.out.println(msg);
    }
}
