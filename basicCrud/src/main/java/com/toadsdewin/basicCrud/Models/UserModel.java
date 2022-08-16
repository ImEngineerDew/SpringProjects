package com.toadsdewin.basicCrud.Models;

import javax.persistence.*;

@Entity
@Table(name = "test")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (unique = true, nullable = false)
    public Long id;
    private String name;
    private String surname;
    private String email;


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
    public String getEmail()
    {
        return email;
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
    public void setEmail(String email) {
        this.email = email;
    }
}
