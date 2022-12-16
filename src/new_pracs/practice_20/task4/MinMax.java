package new_pracs.practice_20.task4;

public class MinMax<T extends Comparable> {
    T[] arr;
    MinMax(T[] arr) {
        this.arr = arr;
    }

    public T min() {
        T min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min.compareTo(arr[i]) == 1) {
                min = arr[i];
            }
        }
        return min;
    }

    public T max() {
        T max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max.compareTo(arr[i]) == -1) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Integer[] arr = {4, 1, 88,33,5, 104, 5, 10, 12};
        MinMax<Integer> minMax = new MinMax<>(arr);
        System.out.println(minMax.min());
        System.out.println(minMax.max());
    }
}
