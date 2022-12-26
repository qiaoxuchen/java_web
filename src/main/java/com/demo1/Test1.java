package com.demo1;

import java.math.BigDecimal;

public class Test1
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.setName("元宝");
        dog.setAge(1);
        int age = dog.getAge();
        System.out.println(age);
//        System.out.println(dog.toString());

//        int yearAge = dog.getYearAge(1);
//        System.out.println(yearAge);

    }
}
