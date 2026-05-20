package com.lms.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="course_id")  // ADD THIS
    private int id;

    @Column(name="course_name")  // ADD THIS
    private String title;

    @ManyToMany(mappedBy="courses")
    private List<Student> students;

    public Course() {}

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public List<Student> getStudents() { return students; }
    public void setStudents(List<Student> students) { this.students = students; }
}