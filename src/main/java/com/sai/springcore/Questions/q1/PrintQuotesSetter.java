package com.sai.springcore.Questions.q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrintQuotesSetter {
    private Quotes quotes;

    @Autowired
    @Qualifier("hardworkQuotes")
    public void setQuotes(Quotes quotes){
        this.quotes=quotes;
    }
    public void printQuotes(){
        for(String quote: quotes.getQuotes()){
            System.out.println(quote);
        }
    }
}
