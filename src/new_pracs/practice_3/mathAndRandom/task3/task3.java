package new_pracs.practice_3.mathAndRandom.task3;

import java.util.Arrays;
import java.util.Random;

//Создайте массив из 4 случайных целых чисел из отрезка [10;99],
//выведите его на экран в строку, далее определите и выведите на экран сообщение
//о том, является ли массив строго возрастающей последовательностью.

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[4];
        Random rnd = new Random();
        for (int i = 0; i < 4; i++) {
            array[i] = rnd.nextInt(10, 99 + 1);
        }
        for (int i = 0; i < 4 - 1; i++) {
            if (!(array[i] < array[i+1])){
                System.out.println("Array " + Arrays.toString(array) + " is NOT monotonically increasing sequence");
                return;
            }
        }
        System.out.println("Array " + Arrays.toString(array) + " is monotonically increasing sequence");
    }
}
