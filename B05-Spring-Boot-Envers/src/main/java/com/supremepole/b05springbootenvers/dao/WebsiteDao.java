package com.supremepole.b05springbootenvers.dao;

import com.supremepole.b05springbootenvers.entity.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author CodeCoderCoding
 */
@Repository
public interface WebsiteDao extends JpaRepository<Website, Integer>, RevisionRepository<Website, Integer, Integer> {

    /**
     * 查找具有最大id的网站
     * 注：nativeQuery=true表示
     * @return
     */
    @Query(value = "select * from website where id=(select max(id) from website)",nativeQuery = true)
    Website getMaxIdWebsite();

    /**
     * 通过名字查找网站
     * 注：@Query中的变量必须与@Param中的变量同名
     * @param name
     * @return
     */
    @Query(value="select w from website w where w.name=:websiteName")
    Website getWebsiteByName(@Param("websiteName") String name);

    /**
     * 查找符合w.id大于等于方法参数id值的所有网站实体
     * 注：问号后的数字（1和2）代表变量在方法中的位置
     * @param id
     * @param name
     * @return
     */
    @Query(value="select w from website w where w.id>=?1 and w.name=?2")
    List<Website> getWebsiteListById(int id, String name);

}
