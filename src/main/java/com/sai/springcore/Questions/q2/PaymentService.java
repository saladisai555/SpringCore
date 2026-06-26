package com.sai.springcore.Questions.q2;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public void validateCC(){
        System.out.println("Credit card validated");
    }
    public void processPayment(){
        System.out.println("Payment Processed");
    }
    public String process(){
        System.out.println("Processing Payment");
        return "Payment Successful";
    }
}
