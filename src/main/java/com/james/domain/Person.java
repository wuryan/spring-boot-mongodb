package com.james.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author James Chow
 * @createdate 2015/5/5
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
@Document
public class Person {

    @Id
    private String id;

    private String name;

    private int age;

    private String status;

    private int gender;

    private int sal;

    private String imgUrl;

    private String description;

    public Person(String id, String name, int age, String status, int gender, int sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
        this.gender = gender;
        this.sal = sal;
    }

    public Person(String name, int age, String status, int gender, int sal, String imgUrl, String description) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.gender = gender;
        this.sal = sal;
        this.imgUrl = imgUrl;
        this.description = description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Person() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", status='" + status + '\'' +
                ", gender=" + gender +
                ", sal=" + sal +
                ", imgUrl='" + imgUrl + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
