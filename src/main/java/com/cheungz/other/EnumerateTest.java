package com.cheungz.other;

/**
 * @program: More
 * @author: cheungZ
 * @create: 2020-12-20 20:40
 * @description: 枚举类的test
 **/
public enum  EnumerateTest {
    Red("红色",1),Black("黑色",2);

    private String name;
    private Integer index;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    EnumerateTest(String s, int i) {
        this.index = i;
        this.name = s;
    }

    public static String getName(int i){
        //EnumerateTest enumerateTest1[] = EnumerateTest.values();
        //System.out.println(enumerateTest1[0]);
        for (EnumerateTest enumerateTest: EnumerateTest.values())
            if (enumerateTest.getIndex()==i)
                return enumerateTest.getName();
            return null;
    }

    public static void main(String[] args) {
        System.out.println(EnumerateTest.getName(1));
    }
}
