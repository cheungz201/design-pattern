package com.cheungz.serialization;

import java.io.Serializable;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-11-08 17:16
 * @description:
 **/
public class Student implements Serializable {
    //private static final long serialVersionUID = -8795983423564647953L;
    private String name;
    private Integer age;
    private String room;
    private String test;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", room='" + room + '\'' +
                '}';
    }
}
