package com.crud.service.impl;

import com.crud.beans.Student;
import com.crud.dao.StudentDao;
import com.crud.service.IStudentSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentImpl implements IStudentSV {
    @Autowired
    private StudentDao studentDao;
    @Override
    public Student getStudent(int id) {
        return studentDao.getStudent(id);
    }

    @Override
    public List<Student> listStudent() {
        return studentDao.listStudent();
    }

    @Override
    public int deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    @Override
    public int saveStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int updateStudent(Student stu) {
        return studentDao.updateStudent(stu);
    }
}
