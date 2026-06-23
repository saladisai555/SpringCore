package com.sai.springcore.Questions.q1;
import com.sai.springcore.Questions.q1.Quotes;
import com.sai.springcore.Questions.q1.Friendsquotes;
import com.sai.springcore.Questions.q1.PrintQuotesConstructor;
import com.sai.springcore.Questions.q1.HardworkQuotes;
import com.sai.springcore.Questions.q1.PrintQuotesField;
import com.sai.springcore.Questions.q1.PrintQuotesSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringApplicationQ1 {
    public static void main(String[] args){
        ConfigurableApplicationContext context= SpringApplication.run(SpringApplicationQ1.class,args);
        context.getBean(PrintQuotesConstructor.class).printQuotes();
        context.getBean(PrintQuotesSetter.class).printQuotes();
        context.getBean(PrintQuotesField.class).printQuotes();
        context.close();

    }
}
