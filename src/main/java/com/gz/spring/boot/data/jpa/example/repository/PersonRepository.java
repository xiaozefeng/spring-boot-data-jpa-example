package com.gz.spring.boot.data.jpa.example.repository;


import com.gz.spring.boot.data.jpa.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

/**
 * @author xiaozefeng
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    /**
     * find persons by name
     * @param name
     * @return
     */
    List<Person> findByName(String name);


    /**
     * find persons by age
     * @param age
     * @return
     */
    List<Person> findByAge(int age);


    /**
     * find persons by name and address
     * @param name
     * @param address
     * @return
     */
    List<Person> findByNameAndAddress(String name, String address);


    /**
     * find persons by name or address
     * @param name
     * @param address
     * @return
     */
    List<Person> findByNameOrAddress(String name, String address);

    /**
     *  find persons createdTime between startDate and endDate
     * @param startDate
     * @param endDate
     * @return
     */
    List<Person> findByCreatedTimeBetween(Date startDate, Date endDate);

    /**
     * find persons in names
     * @param names
     * @return
     */
    List<Person> findByNameIn(List<String> names);


    /**
     * 获取前10条
     * @param name
     * @return
     */
    List<Person> findFirst10ByName(String name);

    List<Person> findTop10ByName(String name);

}
