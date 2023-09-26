package com.university.University_Management_System.Repo;


import com.university.University_Management_System.Model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer> {
}
