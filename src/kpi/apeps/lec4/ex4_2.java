package kpi.apeps.lec4;

import java.util.Arrays;

/**
 * Шифрування символьного масиву методом Цезаря
 */
public class ex4_2 {
    public static void main(String[] args) {

        char[] array = {'J', 'a', 'v', 'a'};//Вхідний масив
        int key = 4;//Ключ шифрування
        System.out.println("Original array: " + Arrays.toString(array));
        //Шифрування
        for (int i = 0; i < array.length; i++) array[i] += key;
        System.out.println("Encripted array: " + Arrays.toString(array));
        //Розшифрування
        for (int i = 0; i < array.length; i++) array[i] -= key;
        System.out.println("Decripted array: " + Arrays.toString(array));
    }
}
