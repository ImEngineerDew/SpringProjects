package com.toadsdewin.testingGradle.Models;
import lombok.EqualsAndHashCode;
import javax.persistence.*;

@Table
@Entity
@EqualsAndHashCode(callSuper = true)
public class Doctor extends Model
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false, length = 5)
    private Long doctorId;
    @Column(nullable = false, length = 10)
    private String specialization;
    @Column (nullable = false, length = 10)
    private String universityOfOrigin;
}
