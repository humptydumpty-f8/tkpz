package kpi.apeps.lec5;

import java.util.Arrays;

/**
 * Операці з масивом
 */
public class ex2_7 {

    public static void main(String[] args) {

        int[] array = {11, 5, 44, 13, 7}; //оголошуємо і ініціалізуємо масив
        System.out.println(array);//намагаємося вивести наш масив на екран без методу toString - отримуємо 16-ковий число
        System.out.println(Arrays.toString(array));//друкуємо масив "правильно"
        Arrays.sort(array); //сортуємо весь масив
        System.out.println(Arrays.toString(array));//виводимо відсортований масив на екран
        int key = Arrays.binarySearch(array, 5); //шукаємо число 5 в відсортованому масиві
        System.out.println(key);//роздруковуємо індекс шуканого числа
        System.out.println(Arrays.binarySearch(array, 0));//а тепер спробуємо знайти число, якого в масиві немає,
        // і відразу ж виведемо результат на екран
    }
}
