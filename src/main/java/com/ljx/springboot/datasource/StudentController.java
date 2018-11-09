package com.ljx.springboot.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/findall")
    @ResponseBody
    public List<Student> findAll() {
        List<Student> all = studentService.findAll();
        return all ;
    }

    @RequestMapping("/findone")
    @ResponseBody
    public Student findOne(int id) {
        Student student = studentService.findById(id);
        return student;

    }

    @RequestMapping("/update")
    @ResponseBody
    public int update(Student student) {
        return studentService.updateStudent(student);

    }

    @RequestMapping("/insert")
    @ResponseBody
    public int insert(Student student) {
        return studentService.addStudent(student);
    }

    @RequestMapping("/delete")
    @ResponseBody
    public int delete(int id) {
        return studentService.deleteStudent(id);
    }
}
