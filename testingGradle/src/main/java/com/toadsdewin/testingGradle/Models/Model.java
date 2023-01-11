package com.toadsdewin.testingGradle.Models;
import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@MappedSuperclass
public class Model implements Serializable
{
    @Column(name = "Nombre", nullable = false, length = 50)
    private String firstName;
    @Column(name = "Apellido", nullable = false, length = 50)
    private String lastName;
    @Column(name = "país", nullable = false, length = 25)
    private String country;
    @Column(name = "edad", nullable = false,length = 2)
    private int age;
    @Column(name = "DNI", nullable = false, length = 9)
    private long DNI;
}
