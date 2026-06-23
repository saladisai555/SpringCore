package com.sai.springcore.Questions.q1;

import org.springframework.stereotype.Component;

@Component
public class PrintQuotesConstructor {
    private final Quotes quotes;
    public PrintQuotesConstructor(Quotes quotes){
        this.quotes=quotes;
    }
    public void printQuotes(){
        for(String quote: quotes.getQuotes()){
            System.out.println(quote);
        }
    }

}
