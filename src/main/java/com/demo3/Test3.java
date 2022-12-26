package com.demo3;

public class Test3
{
    public static void main(String[] args)
    {
        Animal animal = new Animal();
        animal.run();

        Dog dog = new Dog();
        dog.run();

        Animal a = new Dog();
        a.run();
    }

}
