package com.toadsdewin.testingGradle.Models;
import javax.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data
@MappedSuperclass
public class Model implements Serializable
{
    @Column(nullable = false, length = 50)
    private String firstName;
    @Column(nullable = false, length = 50)
    private String lastName;
    @Column(nullable = false, length = 25)
    private String country;
    @Column(nullable = false,length = 2)
    private Integer age;
}
