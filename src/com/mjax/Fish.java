package com.mjax;

public class Fish extends AnimalsAbstract implements AnimalsInterface {

    public Fish(String name, int year) {
        super(name, year);
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public void consume() {
        super.consume();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
