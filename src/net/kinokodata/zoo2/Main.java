package net.kinokodata.zoo2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Cat neko = new Cat();
        neko.setName("タマ");
        animals.add(neko);

        Dog inu = new Dog();
        inu.setName("ぽち");
        animals.add(inu);

        Dog inu2 = new Dog();
        inu2.setName("シロ");
        animals.add(inu2);

        Cat neko2 = new Cat();
        neko2.setName("mike");
        animals.add(neko2);

        for(int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            animal.speak();
        }
    }
}
