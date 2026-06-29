package com.sai.springcore.Questions.q7.Entity;
import jakarta.persistence.*;
@Entity
@Table(name="product")
public class Products {
    @Id
    private int prod_id;

    public String getProd_name() {
        return prod_name;
    }

    public void setProd_name(String prod_name) {
        this.prod_name = prod_name;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCatCode() {
        return catCode;
    }

    public void setCatCode(String catCode) {
        this.catCode = catCode;
    }

    private String prod_name;
    private Double price;
    private String catCode;

    public Products(){

    }



}
