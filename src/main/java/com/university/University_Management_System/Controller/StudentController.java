package com.university.University_Management_System.Controller;

import com.university.University_Management_System.Model.DepartmentType;
import com.university.University_Management_System.Model.StudentModel;
import com.university.University_Management_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

@Autowired
    StudentService studentService;


    @PostMapping("/addStudents")
    public String addStudents(@RequestBody List<StudentModel> students){

        return  studentService.addStudents(students);
    }

    @PutMapping("update/id/{id}/studentName")
    public String updateDeptName(@PathVariable Integer id,  @RequestParam DepartmentType deptName){
        return studentService.updateDeptName(id,deptName);
    }

    @DeleteMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable Integer id){
       return studentService.deleteStudent(id);
    }

    @GetMapping("allStudent")
    public List<StudentModel> getAllStudent(){
        return studentService.getAllStudent();
    }

    @GetMapping("studentByID/{id}")
    public Optional<StudentModel> getStudentById(@PathVariable Integer id){
       return studentService.getStudentById(id);
    }


}
