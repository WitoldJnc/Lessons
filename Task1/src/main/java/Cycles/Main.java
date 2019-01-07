package Cycles;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int arraysize = 15;

        int[] array = methodCreate(arraysize);

        int[] resultMethodFor = methodFor(array);
        showInfo(resultMethodFor);

        int[] resultMethodDoWhile = methodDoWhile(array);
        showInfo(resultMethodDoWhile);

        int[] resultMethodWhile = methodWhile(array);
        showInfo(resultMethodWhile);

    }


    public static int[] methodCreate(int size) {
        int[] arrayOrig = new int[size];

        for (int i = 0; i < arrayOrig.length; i++) {
            arrayOrig[i] = i;
        }
        return arrayOrig;
    }


    public static int[] methodFor(int[] arrayOrig) {
        int[] array = Arrays.copyOf(arrayOrig, arrayOrig.length);

        for (int i = 1; i < array.length; i += 2) {
            array[i] = array[i] * array[i - 1];
        }
        return array;
    }


    public static int[] methodDoWhile(int[] arrayOrig) {
        int[] array = Arrays.copyOf(arrayOrig, arrayOrig.length);

        int i = 1;
        do {
            array[i] = array[i] * array[i - 1];
            i += 2;
        } while (i < array.length);
        return array;
    }


    public static int[] methodWhile(int[] arrayOrig) {
        int[] array = Arrays.copyOf(arrayOrig, arrayOrig.length);

        int i = 1;
        while (i < array.length) {
            array[i] = array[i] * (array[i - 1]);
            i += 2;
        }
        return array;
    }

    private static void showInfo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}