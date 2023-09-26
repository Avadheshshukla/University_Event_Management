package com.university.University_Management_System.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
@Entity
public class StudentModel {

    @Id
    private int studentId;
    @NotBlank
    @Pattern(regexp = "^[A-Z][a-zA-Z]*$", message = "First name  start  should be  capital latter ")
    private String firstName;
    private String lastName;
    @Min(value = 18, message = "Age should be greater than or equal to 18")
    @Max(value = 25, message = "Age should be less than or equal to 25")
    private int age;
    @Enumerated(EnumType.STRING)
    private DepartmentType department;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(DepartmentType department) {
        this.department = department;
    }
}
