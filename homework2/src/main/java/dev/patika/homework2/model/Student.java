package dev.patika.homework2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Entity;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// implemented according to requirements
@Entity
public class Student  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String s_name;
    private LocalDate s_birthDate;
    private String s_address;
    private String s_gender;

    @ManyToMany
    private List<Course> studentCourse = new ArrayList<>();


    public Student(String s_name, LocalDate s_birthDate, String s_address, String s_gender) {
        this.s_name = s_name;
        this.s_birthDate = s_birthDate;
        this.s_address = s_address;
        this.s_gender = s_gender;
    }

    public Student() {
    }

    public List<Course> getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(List<Course> studentCourse) {
        this.studentCourse = studentCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public LocalDate getS_birthDate() {
        return s_birthDate;
    }

    public void setS_birthDate(LocalDate s_birthDate) {
        this.s_birthDate = s_birthDate;
    }

    public String getS_address() {
        return s_address;
    }

    public void setS_address(String s_address) {
        this.s_address = s_address;
    }

    public String getS_gender() {
        return s_gender;
    }

    public void setS_gender(String s_gender) {
        this.s_gender = s_gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(s_name, student.s_name) && Objects.equals(s_birthDate, student.s_birthDate) && Objects.equals(s_address, student.s_address) && Objects.equals(s_gender, student.s_gender) && Objects.equals(studentCourse, student.studentCourse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, s_name, s_birthDate, s_address, s_gender, studentCourse);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", s_name='" + s_name + '\'' +
                ", s_birthDate=" + s_birthDate +
                ", s_address='" + s_address + '\'' +
                ", s_gender='" + s_gender + '\'' +
                ", studentCourse=" + studentCourse +
                '}';
    }
}