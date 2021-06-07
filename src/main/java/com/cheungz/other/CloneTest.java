package com.cheungz.other;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-27 14:15
 * @Version: 1.0.0
 * @Description:
 **/
public class CloneTest implements Cloneable{

    final Integer a = 1;
    private String name;
    private Integer age;

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloneTest cloneTest = new CloneTest();

        System.out.println(cloneTest.clone());

    }
}
