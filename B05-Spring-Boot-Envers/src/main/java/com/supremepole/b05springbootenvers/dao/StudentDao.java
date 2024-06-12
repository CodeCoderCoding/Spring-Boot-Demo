package com.supremepole.b05springbootenvers.dao;

import com.supremepole.b05springbootenvers.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {



}
