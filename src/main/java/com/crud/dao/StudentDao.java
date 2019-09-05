package com.crud.dao;

import com.crud.beans.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentDao {
    Student getStudent(int id);

    List<Student> listStudent();

    int deleteStudent(int id);

    int insertStudent(Student student);

    int updateStudent(Student stu);
}
