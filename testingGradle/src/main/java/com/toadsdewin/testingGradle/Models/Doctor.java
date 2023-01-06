package com.toadsdewin.testingGradle.Models;
import javax.persistence.*;

@Entity
public class Doctor extends Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, length = 5)
    private Long doctorId;
    @Column(nullable = false, length = 10)
    private String specialization;
    @Column (nullable = false, length = 10)
    private String universityOfOrigin;


}
