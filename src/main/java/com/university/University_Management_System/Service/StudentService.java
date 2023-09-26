package com.university.University_Management_System.Service;

import com.university.University_Management_System.Model.DepartmentType;
import com.university.University_Management_System.Model.EventModel;
import com.university.University_Management_System.Model.StudentModel;
import com.university.University_Management_System.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    public String addStudents(List<StudentModel> students) {
        studentRepo.saveAll(students);
        return "students added !!";
    }

    public List<StudentModel> getAllStudent() {
        return studentRepo.findAll();
    }


    public Optional<StudentModel> getStudentById(Integer id) {
        return  studentRepo.findById(id);
    }

    public String deleteStudent(Integer id) {
       studentRepo.deleteById(id);
       return "Student Deleted !";
    }

    public String updateDeptName(Integer id, DepartmentType deptName) {
        StudentModel name=studentRepo.findById(id).orElse(null);
        if(name != null){
            name.setDepartment(deptName);
            studentRepo.save(name);
            return "Student Department updated !";
        }
        return "No valid Data !";
    }
    }

