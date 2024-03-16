package com.example.muahexanh_resigtration.services.Student;

import com.example.muahexanh_resigtration.dtos.LoginDTO;
import com.example.muahexanh_resigtration.dtos.StudentDTO;
import com.example.muahexanh_resigtration.entities.ProjectEntity;
import com.example.muahexanh_resigtration.entities.StudentEntity;
import com.example.muahexanh_resigtration.entities.StudentEntity;

import java.text.ParseException;
import java.util.List;

public interface iStudentService {

    StudentEntity insertStudent(StudentDTO StudentDTO) throws Exception;

    StudentEntity loginStudent(LoginDTO LoginDTO) throws Exception;

    StudentEntity updateStudent(long id, StudentDTO StudentDTO) throws Exception;

    void deleteStudent(long id) throws ParseException;

    StudentEntity getStudentById(long id) throws Exception;

    List<StudentEntity> getAllStudent();
}
