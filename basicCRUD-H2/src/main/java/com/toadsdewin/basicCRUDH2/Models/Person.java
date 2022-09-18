package com.toadsdewin.basicCRUDH2.Models;
import javax.persistence.*;

@Entity
@Table
public class Person
{
    @Id
    private Long id;
    private String name;
    private String surname;
    private String email;
    private String country;
    private Integer phone;

    public Person()
    {

    }
    public Person(Long id, String name, String surname, String email, String country, Integer phone)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.country = country;
        this.phone = phone;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public Integer getPhone() {
        return phone;
    }
    public void setPhone(Integer phone) {
        this.phone = phone;
    }
}