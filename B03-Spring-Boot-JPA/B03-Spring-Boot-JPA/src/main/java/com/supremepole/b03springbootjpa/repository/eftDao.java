package com.supremepole.b03springbootjpa.repository;

import com.supremepole.b03springbootjpa.entity.Website;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @ClassName eftDao
 * @Description
 * @Date 2022/8/8 17:09
 * @Version 1.0.0
 **/
public interface eftDao extends JpaRepository<Website, Integer> {
}
