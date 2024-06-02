package com.supremepole.b05springbootenvers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;

public interface WebsiteEntityRepository extends JpaRepository<Website, Integer>, RevisionRepository<Website, Integer, Integer> {
}
