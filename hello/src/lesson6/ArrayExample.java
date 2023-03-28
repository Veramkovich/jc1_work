package lesson6;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {
        int[] arr1;
        //int arr2[];  // Not recommended for usage

        arr1 = new int[5];  // We know array size but do not know elements

        int[] arr2 = {5, 2, 3, 1, 4}; // We know size and elements

        for(int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr2); // Sort

        for(int elementArr2 : arr2) {
            System.out.print(elementArr2 + " ");
        }
    }

}
