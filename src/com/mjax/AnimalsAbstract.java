package com.mjax;

public abstract class AnimalsAbstract  {

    static int maxId = 0;
    int id;
    String name;
    int year;

    public AnimalsAbstract(String name, int year){
        maxId++;
        id = maxId;
        this.name = name;
        this.year = year;
    }
    public abstract String move();
    public abstract String breath();
    public abstract String reproduce();

    public void consume(){
        System.out.println("it consumes");
    };

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getId() {
        return id;
    }

}
