package com.sai.springcore.Questions.q1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Friendsquotes implements Quotes {
    @Override
    public String[] getQuotes() {
        return new String[]{
                "A friend ","Friendship","true friends"
        };
    }
}
