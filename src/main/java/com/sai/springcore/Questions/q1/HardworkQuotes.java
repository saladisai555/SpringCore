package com.sai.springcore.Questions.q1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class HardworkQuotes implements Quotes{
    @PostConstruct
    public void init(){
        System.out.println("bean of hardwork created");
    }

    @Override
    public String[] getQuotes() {
        return new String[]{
                "hardwork pays",
                "hardwork ",
                "abcdef",
                "dream big "
        };
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Hardwork bean destroyed");
    }
}
