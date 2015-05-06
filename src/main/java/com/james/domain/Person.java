package com.james.domain;

/**
 * @author James Chow
 * @createdate 2015/5/5
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
public class Person {

    private String id;

    private String name;

    private int age;

    private String status;

    private int gender;

    private int sal;

    public Person(String id, String name, int age, String status, int gender, int sal) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.status = status;
        this.gender = gender;
        this.sal = sal;
    }

    public Person(String name, int age, String status, int gender, int sal) {
        this.name = name;
        this.age = age;
        this.status = status;
        this.gender = gender;
        this.sal = sal;
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
                '}';
    }
}
