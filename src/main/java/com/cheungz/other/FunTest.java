package com.cheungz.other;

/**
 * @Program: More
 * @Author: Zhang Zhe
 * @Create: 2021-04-10 15:17
 * @Version: 0.0.1
 * @Description:
 **/
public class FunTest {
    public void fun(){
        System.out.println("父类的方法");
    }

    public void p1(){
        fun();
    }

    static class Son extends FunTest{
        @Override
        public void fun() {
            System.out.println("子类重写父类方法");
        }

        public void h(){
            p1();
        }

        public static void main(String[] args) {
            Son son = new Son();
            son.h();
        }
    }
}
