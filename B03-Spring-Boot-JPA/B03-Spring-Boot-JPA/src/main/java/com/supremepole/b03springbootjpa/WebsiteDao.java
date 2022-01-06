package com.supremepole.b03springbootjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
public interface WebsiteDao extends JpaRepository<Website, Integer> {
    @Query(value = "select * from website where id=(select max(id) from website)",nativeQuery = true)
    Website getMaxIdWebsite();
}
