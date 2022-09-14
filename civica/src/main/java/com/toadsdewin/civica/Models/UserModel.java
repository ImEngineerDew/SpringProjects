package com.toadsdewin.civica.Models;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="users")
public class UserModel{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true, nullable = false)
    private Long id;
    public String gender;
    public String fullName;
    public String email;
    public Integer age;
    public String city;
    public String picture;

    /**** Getters ****/
    public Long getID()
    {
        return id;
    }
    public String getGender() {
        return gender;
    }
    public String getFullName() {
        return fullName;
    }
    public String getEmail() {
        return email;
    }
    public Integer getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String getPicture() {
        return picture;
    }

    /**** Setters ****/
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
}
