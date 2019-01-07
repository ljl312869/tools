package com.learn.learn20181218;

import java.util.concurrent.ConcurrentHashMap;

class Person{
    String name;
    int age;
    public void tell(){
        System.out.println("姓名： " + name + ",年龄： " + age);}


}


public class TestDemo {
    public static void main(String[] args) {
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        Person person = new Person();
       // person.name="张三";
        //person.age=30;
        person.tell();
    }
}
