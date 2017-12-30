package com.gz.spring.boot.data.jpa.example.repository;

import com.gz.spring.boot.data.jpa.example.entity.Person;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;


    @Test
    public void findByName() {
        List<Person> list = personRepository.findByName("jack");
        Assert.assertEquals("123", list.get(0).getName(), "jack");
    }

    @Test
    public void findByAge() {
        List<Person> list = personRepository.findByAge(18);
        Assert.assertEquals("123", list.get(0).getAge(), 18);
    }

    @Test
    public void findByNameAndAddress() {
        List<Person> list = personRepository.findByNameAndAddress("jack", "湖南");
        System.out.println(list);
        Assert.assertEquals("123", list.get(0).getName(), "jack");
    }

    @Test
    public void findByNameOrAddress() {

    }

    @Test
    public void findByCreatedTimeBetween() {
    }

    @Test
    public void findByNameIn() {
    }

    @Test
    public void findFirst10ByName() {
    }

    @Test
    public void findTop10ByName() {
    }

    @Test
    public void nameQueryByName() {
        List<Person> list = personRepository.nameQueryByName("湖南");
        Assert.assertEquals("123", list.get(0).getAddress(), "湖南");
    }

    @Test
    public void useQueryFindByName(){

    }

    @Test
    public void useQueryParamFindByName(){

    }
}