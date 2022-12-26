package com.demo2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class Bird extends Animal
{
    private String fly;

    private void flyMethod () {
        System.out.println(this.fly);
    }

    @Override
    public String toString()
    {
        return "Bird{" +
                "fly='" + fly + '\'' +
                '}';
    }
}
