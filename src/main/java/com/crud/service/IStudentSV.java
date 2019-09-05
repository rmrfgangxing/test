package com.crud.service;

import com.crud.beans.Student;

import java.util.List;

public interface IStudentSV {
    Student getStudent(int id);

    List<Student> listStudent();

    int deleteStudent(int id);

    int saveStudent(Student student);

    int updateStudent(Student stu);
}
