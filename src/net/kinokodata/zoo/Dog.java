package net.kinokodata.zoo;

public class Dog extends Animal {
    // ポリモーフィズムの考え方
    // 猫も犬も喋るが、それぞれ別の喋り方をする
    // thisは自分自身
    // nameは親から継承したインスタンス変数
    @Override
    public void speak() {
        System.out.println("わんわん。ぼくは" + this.name + "だわん！");
    }
}
