package com.gz.spring.boot.data.jpa.example.repository;


import com.gz.spring.boot.data.jpa.example.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.Date;
import java.util.List;

/**
 * @author xiaozefeng
 */
@RepositoryRestResource(path = "persons")
public interface PersonRepository extends JpaRepository<Person, Long>, JpaSpecificationExecutor<Person> {

    /**
     * find persons by name
     * @param name
     * @return
     */
    @RestResource(path = "nameStartWith", rel = "findByName")
    List<Person> findByName(@Param("name") String name);


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

    /**
     * nameQuery
     * @param name
     * @return
     */
    List<Person> nameQueryByName(String name);


    @Query("select a from Person a where a.name = ?1")
    List<Person> useQueryFindByName(String name);

    /**
     *
     * @param name
     * @return
     */
    @Query("select a from Person a where a.name = :name")
    List<Person> useQueryParamFindByName(@Param("name") String name);
}
