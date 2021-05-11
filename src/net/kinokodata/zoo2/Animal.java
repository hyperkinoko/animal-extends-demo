package net.kinokodata.zoo2;

public class Animal {
    private String name;

    // getterを通して名前を教える
    public String getName() {
        return this.name;
    }

    // setterを通して名前を書き換える
    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Hello! 私は" + this.name + "です");
    }
}
