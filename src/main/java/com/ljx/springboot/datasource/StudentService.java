package com.ljx.springboot.datasource;

import java.util.List;

public interface StudentService {
    int addStudent(Student s);
    int deleteStudent(int id);
    int updateStudent(Student s);
    List<Student> findAll();
    Student findById(int id);

}
