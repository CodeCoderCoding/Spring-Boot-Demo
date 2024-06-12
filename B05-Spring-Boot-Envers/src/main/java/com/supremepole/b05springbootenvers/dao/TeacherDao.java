package com.supremepole.b05springbootenvers.dao;

import com.supremepole.b05springbootenvers.entity.Student;
import com.supremepole.b05springbootenvers.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherDao extends JpaRepository<Teacher, Integer> {



}
