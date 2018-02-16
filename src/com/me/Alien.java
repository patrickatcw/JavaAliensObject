package com.me;

public class Alien {

    //Step 1 create fields for Alien
    private String from;
    private String color;
    private String height;
    private String body;
    private String clothes;

    //Step 2 make my own constructor method with parameters
    public Alien(String from, String color, String height, String body, String clothes) {

        //Step 3 this. to reference fields above
        this.from = from;
        this.color = color;
        this.height = height;
        this.body = body;
        this.clothes = clothes;

    }

    //Step 4 create getter methods for this. fields
    public String getFrom() {
        return this.from;
    }

    public String getColor() {
        return this.color;
    }

    public String getHeight() {
        return this.height;
    }

    public String getBody() {
        return this.body;
    }

    public String getClothes() {
        return this.clothes;
    }

}
