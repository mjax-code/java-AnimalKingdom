package com.mjax;

public class Birds extends AnimalsAbstract implements AnimalsInterface {

//    private int id;
//    private String name;
//    private int year;

    public Birds(String name, int year) {
        super(name, year);
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
    public String move() {
        return "fly";
    }

    @Override
    public void consume() {
        super.consume();
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }
}
