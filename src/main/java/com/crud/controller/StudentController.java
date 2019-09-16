package com.crud.controller;

import com.crud.beans.Student;
import com.crud.service.IStudentSV;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private IStudentSV iStudentSV;

    @ResponseBody
    @RequestMapping("/getStudent.do")
    public String getStudent(@RequestParam(defaultValue = "1") int id) {
        System.out.println("111111");
        Student student = iStudentSV.getStudent(id);
        System.out.println(student);
        return student.toString();
    }

    @ResponseBody
    @RequestMapping("/listStudent.do")
    public List<Student> listStudent() {
        List<Student> studentList = iStudentSV.listStudent();
        System.out.println(studentList);
        return studentList;
    }

    @ResponseBody
    @RequestMapping("/deleteStudent.do")
    public int delStudent(int id) {
        int row = iStudentSV.deleteStudent(id);
        System.out.println(row);
        return row;
    }

    @ResponseBody
    @RequestMapping("/addStudent.do")
    public int addStudent(){
        Student student = new Student();
        student.setName("liwu");
        student.setAge(15);
        student.setScore(90);
        int row = iStudentSV.saveStudent(student);
        return row;
    }

    @RequestMapping("/updateStudent")
    public void updateStudent(){
        Student stu = new Student();
        stu.setId(18);
        stu.setName("小五");
        stu.setAge(15);
        stu.setScore(90);
        int row = iStudentSV.updateStudent(stu);
        System.out.println(row);
        System.out.println("123");
    }
}
