package com.toadsdewin.basicCrud.Models;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true, nullable = false)
    public Long id;
    private String name;
    private String surname;
    private String country;
    private String email;
    private String rol;
    private String career;

    public UserModel() {} /*An empty consturctor*/

    public UserModel(Long id, String name, String surname,String country, String email, String rol, String career)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.email = email;
        this.rol = rol;
        this.career = career;
    }

    /***  Getters   ***/
    public Long getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public String getCountry(){ return country;}
    public String getRol(){return rol;}
    public String getEmail()
    {
        return email;
    }
    public String getCareer()
    {
        return career;
    }

    /*** Setters ***/
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setCountry(String country) {this.country = country;}
    public void setRol(String rol){this.rol = rol;}
    public void setEmail(String email) {
        this.email = email;
    }

    public void setCareer(String career) {
        this.career = career;
    }
}
