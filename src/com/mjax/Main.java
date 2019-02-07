package com.mjax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void orderAnimalsByYear(ArrayList<AnimalsAbstract> animals){
       Collections.sort(animals, new Comparator<AnimalsAbstract>() {
           public int compare(AnimalsAbstract o1, AnimalsAbstract o2) {
               return o1.getYear() - o2.getYear();
           }
       });

       for (AnimalsAbstract animal : animals) {
           System.out.println(animal.getName());
       }
    }

    public static void alphabetical(ArrayList<AnimalsAbstract> animals){
        Collections.sort(animals, (o1,o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        for (AnimalsAbstract animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void movement(ArrayList<AnimalsAbstract> animals) {
        Collections.sort(animals, Comparator.comparing((AnimalsAbstract animal) -> animal.move()));
        for (AnimalsAbstract animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void lungs(ArrayList<AnimalsAbstract> animals) {
        ArrayList<AnimalsAbstract> newList = new ArrayList<>(animals);

        newList.removeIf((AnimalsAbstract animal) -> (!animal.breath().equals("lungs")));
        for (AnimalsAbstract animal : newList) {
            System.out.println(animal.getName());
        }
    }

    public static void lungs1758(ArrayList<AnimalsAbstract> animals) {
        ArrayList<AnimalsAbstract> newList = new ArrayList<>(animals);

        newList.removeIf((AnimalsAbstract animal) -> (!animal.breath().equals("lungs") || animal.getYear() != 1758));
        System.out.println("lungs and 1758");
        for (AnimalsAbstract animal : newList) {
            System.out.println(animal.getName());
        }
    }
    public static void lungsEggs(ArrayList<AnimalsAbstract> animals) {
        ArrayList<AnimalsAbstract> newList = new ArrayList<>(animals);

        newList.removeIf((AnimalsAbstract animal) -> (!animal.breath().equals("lungs") || !animal.reproduce().equals("eggs")));
        System.out.println("lungs and eggs");
        for (AnimalsAbstract animal : newList) {
            System.out.println(animal.getName());
        }
    }

    public static ArrayList<AnimalsAbstract> only1758(ArrayList<AnimalsAbstract> animals){
        ArrayList<AnimalsAbstract> newList = new ArrayList<>(animals);
        newList.removeIf((AnimalsAbstract animal) -> (animal.getYear() != 1758));
        return newList;
    }

    public static void main(String[] args) {
	// write your code here

        ArrayList<AnimalsAbstract> animalsList = new ArrayList<>();

        animalsList.add(new Mammals("Panda", 1869));
        animalsList.add(new Mammals("Zebra", 1778));
        animalsList.add(new Mammals("Koala", 1816));
        animalsList.add(new Mammals("Sloth", 1804));
        animalsList.add(new Mammals("Armadillo", 1758));
        animalsList.add(new Mammals("Raccoon", 1758));
        animalsList.add(new Mammals("Bigfoot", 2021));

        animalsList.add(new Birds("Pigeon", 1837));
        animalsList.add(new Birds("Peacock", 1837));
        animalsList.add(new Birds("Toucan", 1837));
        animalsList.add(new Birds("Parrot", 1837));
        animalsList.add(new Birds("Swan", 1837));

        animalsList.add(new Fish("Salmon", 1758));
        animalsList.add(new Fish("Catfish", 1758));
        animalsList.add(new Fish("Perch", 1758));

        for (AnimalsAbstract animal : animalsList) {
            System.out.println(animal.getName());
        }
        System.out.println("\n");
        orderAnimalsByYear(animalsList);
        System.out.println("\n");
        alphabetical(animalsList);
        System.out.println("\n");
        movement(animalsList);
        System.out.println("\n");
        lungs(animalsList);
        System.out.println("\n");
        lungs1758(animalsList);
        System.out.println("\n");
        lungsEggs(animalsList);
        System.out.println("\n");
        alphabetical(only1758(animalsList));


    }
}
