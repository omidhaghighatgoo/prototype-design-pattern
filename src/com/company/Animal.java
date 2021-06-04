package com.company;


import java.util.Objects;

public abstract class Animal implements Cloneable  {

    public Animal() {
    }

    public Animal(long id, String name, String color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    private long id;
    private String name;
    private String color;


    public Object clone(){
        Object clone = null;

        try{
            clone = super.clone();

        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id &&
                Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
