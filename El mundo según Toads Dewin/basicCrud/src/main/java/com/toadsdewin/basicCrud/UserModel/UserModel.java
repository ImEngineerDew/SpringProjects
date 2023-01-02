package com.toadsdewin.basicCrud.UserModel;
import javax.persistence.*;

@Entity
@Table(name = "userModel")
public class UserModel
{
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true, length = 10)
    private Long id;
    @Column(name = "Nombre", nullable = false, length = 255)
    private String name;
    @Column(name = "Apellido", nullable = false, length = 255)
    private String surname;
    @Column(name = "País", nullable = false, length = 255)
    private String country;
    @Column(name = "Ocupación", nullable = false, length = 255)
    private String occupation;
    @Column(name = "Profesión", nullable = false, length = 255)
    private String profession;
    @Column(name = "Edad", nullable = false, length = 20)
    private Integer age;

    public UserModel()
    {
        name = "John";
        surname = "Doe";
        country = "United States";
        occupation = "HR Administrator";
        profession = "Economist";
        age = 30;
    }
    public UserModel (String name, String surname, String country, String occupation, String profession, Integer age)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.occupation = occupation;
        this.profession = profession;
        this.age = age;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}