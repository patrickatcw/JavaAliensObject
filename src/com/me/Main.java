package com.me;

public class Main {

    public static void main(String[] args) {

        //Step 5 use constructors to build new instances
        //of a class, creating new objects
        Alien one = new Alien("Mars", "green", "short", "thin", "disco");
        Alien two = new Alien("Venus", "orange", "tall", "boney", "clown");
        Alien three = new Alien("Pluto", "purple", "short", "pudgy", "victorian");
        Alien four = new Alien("Saturn", "red", "average", "stocky", "cowboy");


        //Step 6 Printout logic and statements
        //one.getFrom, etc.
        System.out.println("These are the aliens that came to the house party;");
        System.out.println("The first alien that showed up was from " + one.getFrom()
                + ". He was " + one.getColor() + ", " + one.getHeight() + ", " + "and " + one.getBody()
                + ", " + "wearing " + one.getClothes() + " clothes.");
        System.out.println("The next alien that showed up was from " + two.getFrom()
                + ". He was " + two.getColor() + ", " + two.getHeight() + ", " + "and " + two.getBody()
                + ", " + "wearing " + two.getClothes() + " clothes.");
        System.out.println("The third alien that showed up was from " + three.getFrom()
                + ". He was " + three.getColor() + ", " + three.getHeight() + ", " + "and " + three.getBody()
                + ", " + "wearing " + three.getClothes() + "-style clothes.");
        System.out.println("The last alien that showed up was from " + four.getFrom()
                + ". He was " + four.getColor() + ", " + four.getHeight() + ", " + "and " + four.getBody()
                + ", " + "wearing " + four.getClothes() + " clothes.");
    }
}

//Printout results
/*
These are the aliens that came to the house party;
The first alien that showed up was from Mars. He was green, short, and thin, wearing disco clothes.
The next alien that showed up was from Venus. He was orange, tall, and boney, wearing clown clothes.
The third alien that showed up was from Pluto. He was purple, short, and pudgy, wearing victorian-style clothes.
The last alien that showed up was from Saturn. He was red, average, and stocky, wearing cowboy clothes.
*/
