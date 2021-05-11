package sort;

// import java.util.Random;

public class App {
    public static void main(String[] args) {
        // int arrayLength = 10;
        // int count = 0;
        // int[] array = createArray(arrayLength);
        int[] array = {31, 87, 42, 88, 89, 13, 64, 18, 99, 42};
        displayArray(array);

        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                //count++;
                if(array[i] > array[j]) {
                    swap(array, i, j);
                    System.out.println("i: " + i + " / j: " + j);
                    displayArray(array);
                }
            }
        }
        // displayArray(array);
        // System.out.println("比較回数：　" + count);
    }

    // private static int[] createArray(int length) {
    //     int[] array = new int[length];
    //     for(int i = 0; i < length; i++) {
    //         array[i] = new Random().nextInt(100);
    //     }
    //     return array;
    // }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    private static void displayArray(int[] a) {
        for(int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println(a[a.length - 1]);
    }
}