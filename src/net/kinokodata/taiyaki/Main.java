package net.kinokodata.taiyaki;

public class Main {
    public static void main(String[] args) {
        Taiyaki t1 = new Taiyaki("カスタード");
        System.out.println(t1.getNakami());
        Taiyaki t2 = new Taiyaki();
        System.out.println(t2.getNakami());
    }

}

