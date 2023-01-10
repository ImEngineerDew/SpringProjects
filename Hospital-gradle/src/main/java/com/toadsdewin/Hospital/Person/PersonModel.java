package com.toadsdewin.Hospital.Person;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@MappedSuperclass
public class PersonModel implements Serializable
{
    @Column(name = "Nombre", nullable = false, length = 255)
    public String name;
    @Column(name = "Apellido", nullable = false, length = 255)
    private String surname;
    @Column(name = "Edad", nullable = false, unique = true)
    private Integer age;
    @Column(name = "País", nullable = false, length = 255)
    private String countryOfOrigin;
    public PersonModel()
    {
        name = "John";
        surname = "Doe";
        age     =  30;
        countryOfOrigin = "United States";
    }
    public PersonModel(String name, String surname, String countryOfOrigin, Integer age)
    {
        this.name = name;
        this.surname = surname;
        this.countryOfOrigin = countryOfOrigin;
        this.age = age;
    }
    /**Getters and Setters**/
    /**Used by Lombok**/
}
