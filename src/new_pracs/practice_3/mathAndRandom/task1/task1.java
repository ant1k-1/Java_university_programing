package new_pracs.practice_3.mathAndRandom.task1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//Создать массив вещественных чисел случайным образом, вывести его
//на экран, отсортировать его, и снова вывести на экран (использовать два подхода
//к генерации случайных чисел – метод random() класса Math и класс Random)

public class task1 {
    public static void main(String[] args) {
        ArrayList<Double> array1 = new ArrayList<>();
        ArrayList<Double> array2 = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            array1.add(Math.random()*100);
            array2.add(rnd.nextDouble(100));
        }

        System.out.println("Before arr_1: " + array1.toString());
        System.out.println("Before arr_2: " + array2.toString());

        array1.sort(Double::compareTo);
        array2.sort(Double::compareTo);

        System.out.println("After arr_1: " + array1.toString());
        System.out.println("After arr_2: " + array2.toString());
    }
}
