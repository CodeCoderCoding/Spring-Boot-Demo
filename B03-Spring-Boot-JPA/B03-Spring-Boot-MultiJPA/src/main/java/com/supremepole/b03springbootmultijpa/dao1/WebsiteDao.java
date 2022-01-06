package com.supremepole.b03springbootmultijpa.dao1;

import com.supremepole.b03springbootmultijpa.model.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * @author CodeCoderCoding
 */
public interface WebsiteDao extends JpaRepository<Website,Integer>{
    @Query(value = "select * from website where id=(select max(id) from website)",nativeQuery = true)
    Website getMaxIdWebsite();
}
