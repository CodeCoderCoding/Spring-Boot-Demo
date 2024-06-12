package com.supremepole.b05springbootenvers.dao;

import com.supremepole.b05springbootenvers.entity.Website;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface WebsiteEntityRepository extends JpaRepository<Website, Integer>, RevisionRepository<Website, Integer, Integer> {
}
