package com.company;

import java.util.HashMap;
import java.util.Map;

public class AnimalCache {

    private Map<String , Animal> cache = new HashMap<>() ;

    public AnimalCache(){
        Lion lion1 = new Lion(3 , "lion1","red");
        Rabbit rabbit1 = new Rabbit(4 , "rabbit1", "brown");

        cache.put("lion1" , lion1);

        cache.put("rabbit1", rabbit1);

    }


    public Animal put (String key , Animal value){
        cache.put(key , value);
        return value;
    }

    public Animal get (String key){
        return (Animal) cache.get(key).clone();
    }
}
