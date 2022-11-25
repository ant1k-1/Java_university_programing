package new_pracs.practice_3.mathAndRandom.task4;

//Пользователь должен ввести с клавиатуры размер массива -
//натуральное число больше 0, так чтобы введенное пользователем число
//сохранялось в переменную n. Если пользователь ввел не подходящее число, то
//программа должна просить пользователя повторить ввод. Создать массив из n
//случайных целых чисел из отрезка [0; n] и вывести его на экран. Создать второй
//массив только из четных элементов первого массива, если они там есть, и
//вывести его на экран.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        int n = -1;
        int[] array;

        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        while (n <= 0){
            System.out.println("Enter array's size: ");
            n = scanner.nextInt();
        }

        array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(0, n+1);
        }
        System.out.println("Origin array: " + Arrays.toString(array));
        if (n/2 != 0) {
            ArrayList<Integer> evenArray = new ArrayList<Integer>();
            n = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i]%2==0) evenArray.add(array[i]);
            }
            System.out.println("Even-numbered array: " + evenArray.toString());
        }
        else System.out.println("Even-numbered array is empty");
    }
}
