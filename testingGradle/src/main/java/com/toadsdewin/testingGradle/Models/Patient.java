package com.toadsdewin.testingGradle.Models;
import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient extends Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 10)
    private Long patientID;

    @Column(name= "Especialización", nullable = false, length = 25)
    private String specialization;

    @Column(name = "Departamento de origen", nullable = false, length = 25)
    private String provinceOfOrigin;
}
