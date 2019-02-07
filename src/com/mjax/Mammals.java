package com.mjax;

public class Mammals extends AnimalsAbstract implements AnimalsInterface {
    public Mammals(String name, int year) {
        super(name, year);
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live birth";
    }

    @Override
    public String move() {
        return "walk";
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
}
