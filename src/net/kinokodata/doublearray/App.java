package net.kinokodata.doublearray;

public class App {
    public static void main(String[] args) {
        int[][] scores = {
                {67, 89, 92, 64, 90},
                {57, 81, 91, 48, 74},
                {80, 91, 97, 82, 87},
                {78, 59, 71, 62, 77}
        };

        for(int i = 0; i < scores.length; i++) {
            for(int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        int[] score = {67, 89, 92, 64, 90};

        System.out.println();
    }
}
