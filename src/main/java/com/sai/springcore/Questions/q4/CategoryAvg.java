package com.sai.springcore.Questions.q4;

public class CategoryAvg {
    private String cat_code;
    private double categoryAvg;

    public CategoryAvg(String cat_code, double categoryAvg) {
        this.cat_code = cat_code;
        this.categoryAvg = categoryAvg;
    }

    public String getCat_code() {
        return cat_code;
    }

    public void setCat_code(String cat_code) {
        this.cat_code = cat_code;
    }

    public double getCategoryAvg() {
        return categoryAvg;
    }

    public void setCategoryAvg(double categoryAvg) {
        this.categoryAvg = categoryAvg;
    }

    @Override
    public String toString() {
        return "CategoryAvg{" +
                "cat_code='" + cat_code + '\'' +
                ", categoryAvg=" + categoryAvg +
                '}';
    }
}
