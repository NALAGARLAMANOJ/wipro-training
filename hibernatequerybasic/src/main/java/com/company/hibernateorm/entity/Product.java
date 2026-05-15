package com.company.hibernateorm.entity;



import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    public Product(String name, double price, Category category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    // Default constructor
    public Product() {
    }

    // Parameterized constructor
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name +
                ", price=" + price +
                ", category=" + category.getName() +
                '}';
    }

}
