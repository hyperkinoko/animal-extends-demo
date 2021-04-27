package net.kinokodata.zoo;

public abstract class Animal {
    // 動物は名前を持つものとする
    protected String name;

    // getterを通して名前を教える
    public String getName() {
        return this.name;
    }

    // setterを通して名前を書き換える
    public void setName(String name) {
        this.name = name;
    }

    // とりあえず動物はしゃべるものと考える
    // ただしどのようにしゃべるかは、子クラスが書く（実装する）
    abstract public void speak();
}
