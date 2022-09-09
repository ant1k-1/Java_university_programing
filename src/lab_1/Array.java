package lab_1;

import java.util.Arrays;
import java.util.Random;
//Ex 4
//Сгенерировать массив целых чисел случайным образом, вывести
//его на экран, отсортировать его, и снова вывести на экран.
public class Array {
    private int[] numbers;
    private int length;

    public Array(int length) {
        this.numbers = new int[length];
        this.length = length;
    }

    public void randGen(){
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < length; i++) {
            numbers[i] = rnd.nextInt(1000);
        }
    }

    public void print(){
        for (int i = 0; i < length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.print('\n');
    }

    public static void main(String[] args) {
        Array array = new Array(10);
        array.randGen();
        array.print();
        Arrays.sort(array.numbers);
        array.print();
    }
}
