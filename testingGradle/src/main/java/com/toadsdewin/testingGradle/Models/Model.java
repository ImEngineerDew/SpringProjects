package com.toadsdewin.testingGradle.Models;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, length = 5)
    private Long id;

    @Column(nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false, length = 50)
    private String lastName;

    @Column(nullable = false,length = 2)
    private Integer age;
}
