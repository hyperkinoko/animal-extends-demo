package net.kinokodata.hello;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(10);
        list.add(78);

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        // 配列`numbers`の合計値を返す
        for (int index = 0; index < numbers.length; index++) {
            System.out.println(index + "番目は" + numbers[index] + "です");
            sum += numbers[index];
            System.out.println("ここまでの合計は" + sum + "です");
        }
        return sum;
    }

    public static void sayHello() {
        System.out.println("Hello!");
    }

    public static void sayHelloTo(String name) {
        System.out.println("Hello! " + name + "さん");
    }

    public static String createStringHelloTo(String name) {
        return "Hello! " + name + "さん";
    }

    public static boolean isLady(int gender, int age) {
        return age >= 20 && age < 40 && gender == 1;
    }
}
