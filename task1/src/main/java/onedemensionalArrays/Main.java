package onedemensionalArrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arraySize = 20;

        double[] array = createArray(arraySize);
        maxValue(array);
        minValue(array);

    }


    public static double[] createArray(int size) {
        double[] arrays = new double[size];
        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = (int) (Math.random() * -60);
        }
        return arrays;
    }


    public static void maxValue(double[] array) {
        double max = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        System.out.println(Arrays.toString(array) + "\n" + "Maximum value : " + max + "\n");
    }


    public static void minValue(double[] array) {
        double min = Double.POSITIVE_INFINITY;

        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        System.out.println(Arrays.toString(array) + "\n" + "Maximum value : " + min + "\n");
    }

}






