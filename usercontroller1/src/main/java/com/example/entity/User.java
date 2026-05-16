package com.example.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    private Long id;

    private String aadharNo;
    private String panNo;
    private int age;

    public User() {
    }

    public User(Long id, String aadharNo, String panNo, int age) {
        this.id = id;
        this.aadharNo = aadharNo;
        this.panNo = panNo;
        this.age = age;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getAadharNo() {

        return aadharNo;
    }

    public void setAadharNo(String aadharNo) {

        this.aadharNo = aadharNo;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {

        this.panNo = panNo;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
