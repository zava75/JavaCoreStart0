package lesson2;

import java.util.Arrays;
import java.util.Collections;

public class ArrayLesson {

    public static void main(String[] args) {

        System.out.println("public static void main");


    }

    private static void printStr(String[] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    private static void  printInt(int [] args){
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
    }

    public ArrayLesson() {

        System.out.println("Hello ArrayLesson!\n");

        int[] array1 = new int[10];

        String[] array2 = new String[10];

        for (int i = 0; i < array1.length; i++) {

            array1[i] = 9 - i;

        }

        for (int i = 0; i < array2.length; i++) {

            array2[i] = "str # "  + String.valueOf(i);

        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        Arrays.sort(array2, Collections.reverseOrder());

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }

        System.out.println(" --- ");

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        Arrays.sort(array1);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        printStr(array2);
        printInt(array1);

    }


}
