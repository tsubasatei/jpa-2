package com.xt.jpa.spring.entity;

import javax.persistence.*;

/**
 * @author xt
 * @date 2019/2/17 - 16:52
 * @description
 */
@Table(name = "JPA_PERSONS")
@Entity
public class Person {

    private Integer id;
    private String lastName;
    private String email;
    private int age;

    @GeneratedValue
    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
