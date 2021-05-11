package net.kinokodata.zoo2;

public class Dog extends Animal{
    private String name;

    // getterを通して名前を教える
    public String getName() {
        return this.name;
    }

    // setterを通して名前を書き換える
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("わんわん! 僕は" + this.name + "ですわん！");
    }
}
