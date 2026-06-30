package com.sai.springcore.Questions.q6;

public class Prod_category {
    private String prod_name;
    private String Cat_desc;

    public Prod_category(String cat_desc, String prod_name) {
        Cat_desc = cat_desc;
        this.prod_name = prod_name;
    }

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public String getCat_desc() {
        return Cat_desc;
    }

    public void setCat_desc(String cat_desc) {
        Cat_desc = cat_desc;
    }
}
