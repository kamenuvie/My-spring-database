package com.example.Spring_data_jpa;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "Student")
@Table(name = "student",uniqueConstraints = {
        @UniqueConstraint(
                name = "student_email_unique",
                columnNames = "email")
})
public class Student {
   @Id
   @SequenceGenerator(
           name = "student_sequence",
           sequenceName = "student_sequence",
           allocationSize = 1
   )
   @GeneratedValue(
           strategy = SEQUENCE,
           generator = "student_sequence"
   )
   @Column(name = "id",updatable = false)
    private Long id;
   @Column(name = "first_name",nullable = false,columnDefinition = "TEXT")
    private String firstName;
    @Column(name = "last_name",nullable = false,columnDefinition = "TEXT")
    private String lastName;
    @Column(name = "email",nullable = false,columnDefinition = "TEXT")
    private  String email;
    @Column(name = "age",nullable = false)
    private Integer age;
    @Column(name = "password",nullable = false)
    private Integer password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Student() {
    }

    public Student( String firstName, String lastName, String email, Integer age,Integer password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                "password" + password+
                '}';
    }
}
