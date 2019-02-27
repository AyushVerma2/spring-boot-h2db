package com.ayush.learn.test01.repo;

import com.ayush.learn.test01.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo  extends JpaRepository<Student,String> {
}
