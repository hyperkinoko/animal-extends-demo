package net.kinokodata.zoo;

public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("わんわん。ぼくは" + this.name + "だわん！");
    }
}
