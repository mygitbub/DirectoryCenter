package com.luyuwww.entity;

import javax.persistence.*;

/**
 * Created by serv on 2014/11/6.
 */
@Entity
@Table(name = "test_a")
public class TestA extends UUIDBaseEntity {


    private String name;
    private String age;
    private String bz;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
