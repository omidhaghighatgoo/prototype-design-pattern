package com.company;

public class PrototypeMain {

    public static void main(String[] args) {


        Lion lionKing = new Lion(1 , "Lion King", "yellow");
        Rabbit bugsBunny = new Rabbit(2 , "Bugs Bunny","white");

        Lion clonedLion = (Lion) lionKing.clone();
        Rabbit clonedRabbit = (Rabbit) bugsBunny.clone();

        System.out.println(clonedLion.equals(lionKing));
        System.out.println(clonedRabbit.equals(bugsBunny));


        System.out.println("Address of object " + clonedLion);
        System.out.println("Address of object " + lionKing);

        System.out.println(lionKing == clonedLion);

        //========================================================================
        AnimalCache cache = new AnimalCache();

        Lion lion = (Lion) cache.get("lion1");
        Rabbit rabbit = (Rabbit) cache.get("rabbit1");

        System.out.println(lion.getName());
        System.out.println(rabbit.getName());

        System.out.println(lion.equals(lionKing));

        System.out.println(clonedLion.equals(lion));

        System.out.println("Address of object"+lion);

    }
}
