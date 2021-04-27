package net.kinokodata;

import net.kinokodata.zoo.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 犬のインスタンスを2つ作る
        // （コンストラクタについては、また後日解説します）
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        // カプセル化により、直接「dog1.name = "ポチ";」ができないので、
        // setterを通して犬に名前をつける
        dog1.setName("ポチ");
        dog2.setName("シロ");

        // 犬に喋らせる
        dog1.speak();
        dog2.speak();

        // 猫のインスタンスを2つ作る
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        // カプセル化により、直接「cat1.name = "タマ";」ができないので、
        // setterを通して猫に名前をつける
        cat1.setName("タマ");
        cat2.setName("ミケ");

        // 猫に喋らせる
        cat1.speak();
        cat2.speak();
    }
}
