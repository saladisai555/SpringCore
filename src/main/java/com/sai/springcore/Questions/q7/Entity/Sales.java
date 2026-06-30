package com.sai.springcore.Questions.q7.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sale_id;

    private int quantity;

    private double pricePerUnit;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;
    public Sales(){

    }
    public Sales(Products product, double pricePerUnit, int quantity, Long sale_id) {
        this.product = product;
        this.pricePerUnit = pricePerUnit;
        this.quantity = quantity;
        this.sale_id = sale_id;
    }

    public Sales(int quantity, double pricePerUnit, Products product) {
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.product = product;
    }

    public Long getSale_id() {
        return sale_id;
    }

    public void setSale_id(Long sale_id) {
        this.sale_id = sale_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public Products getProduct() {
        return product;
    }

    public void setProduct(Products product) {
        this.product = product;
    }
    @Override
    public String toString() {
        return "Sales{" +
                "sale_id=" + sale_id +
                ", quantity=" + quantity +
                ", pricePerUnit=" + pricePerUnit +
                ", product=" + product.getName() +
                '}';
    }
}
