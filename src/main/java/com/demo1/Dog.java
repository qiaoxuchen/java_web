package com.demo1;


import lombok.Setter;


@Setter
public class Dog
{
    private String name;
    private int age;

    public String getName()
    {
        return "我叫："+name;
    }

    public int getAge()
    {
        return age+10;
    }

    public int getYearAge(int num){
        return this.age + num;
    }

    @Override
    public String toString()
    {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
