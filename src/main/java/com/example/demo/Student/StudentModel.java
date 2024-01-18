package com.example.demo.Student;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;

@Entity(name="student")
@Table
public class StudentModel {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dbo;
    @Transient //When a field is marked as @Transient, it tells the JPA provider (such as Hibernate) that it should ignore this field when performing database operations like inserting, updating, or querying.
    private Integer age;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDbo() {
        return dbo;
    }

    public void setDbo(LocalDate dbo) {
        this.dbo = dbo;
    }

    public Integer getAge() {
        return Period.between(dbo , LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public StudentModel() {
    }

    public StudentModel(Long id, String name, String email, LocalDate dbo) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dbo = dbo;

    }

    public StudentModel(String name, String email, LocalDate dbo) {
        this.name = name;
        this.email = email;
        this.dbo = dbo;

    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "my id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dbo=" + dbo +
                ", age=" + age +
                '}';
    }
}
