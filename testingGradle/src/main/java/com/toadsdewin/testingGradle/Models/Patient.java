package com.toadsdewin.testingGradle.Models;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Patient")
public class Patient extends Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false, length = 20)
    private Long id;
    @Column(name = "Departamento",nullable = false,length = 50)
    private String provinceOfOrigin;
    @Column(name = "Especialidad",nullable = false,length = 50)
    private String specialization;
    @OneToMany(mappedBy = "patient",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Doctor> doctorList;
}
