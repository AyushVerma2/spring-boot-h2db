package com.ayush.learn.test01.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
//@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
@GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String name;

    public Student(String student) {

        this.name=student;
    }
}
