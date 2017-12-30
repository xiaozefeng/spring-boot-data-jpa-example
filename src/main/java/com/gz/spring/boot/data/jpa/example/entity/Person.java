package com.gz.spring.boot.data.jpa.example.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author xiaozefeng
 */
@Entity
@Table(name = "PERSON")
@NamedQueries(
        @NamedQuery(name = "Person.nameQueryByName", query = "select p from Person p where p.address = ?1")
)
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "created_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;

}
