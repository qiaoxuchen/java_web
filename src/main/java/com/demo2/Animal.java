package com.demo2;

import lombok.Getter;
import lombok.Setter;

@Getter
public class Animal
{
    private String name;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
