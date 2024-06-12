package com.supremepole.b05springbootenvers.entity;

import org.hibernate.envers.DefaultRevisionEntity;
import org.hibernate.envers.RevisionEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="audit_revision")
@RevisionEntity
public class AuditRevisionEntity extends DefaultRevisionEntity{

//    @Id
//    @RevisionNumber
//    @Column(name="id")
//    private int id;
//
//    @RevisionTimestamp
//    @Column(name="timestamp")
//    private long timestamp;


}
