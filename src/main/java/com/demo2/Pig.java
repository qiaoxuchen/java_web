package com.demo2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Pig extends Animal
{
    private String eat;

    @Override
    public String toString()
    {
        return "Pig{" +
                "name='" + super.getName() + '\'' +
                "eat='" + eat + '\'' +
                '}';
    }

    public String eatFood(String vege,String fruits){
        return "佩奇不挑食，"+vege+"、"+fruits+"都吃";
    }
    public String eatFood(String meat){
        return  "元宝很挑食，只吃"+meat;
    }
}
