package com.sai.springcore.Questions.q1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PrintQuotesField {
    @Autowired
    @Qualifier("friendsquotes")
    private Quotes quotes;

    public void printQuotes(){
        for(String quote: quotes.getQuotes()){
            System.out.println(quote);
        }
    }

}
