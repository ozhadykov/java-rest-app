package com.rest.app.setting_scores.dao;

import com.rest.app.setting_scores.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();
}
