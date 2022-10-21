package old.practice_5;

import java.util.Scanner;

public class Recursions {
    //номер в журнале 14
    //ex14 разбить число по цифрам
    public static void splitNumber(int n){
        if (n/10 != 0){
            splitNumber(n/10);
            System.out.print(n%10 + " ");
        }else {
            System.out.print(n + " ");
            //дошли до старшего разряда
        }
    }

    //ex15 разбить число по цифрам и развернуть
    public static void ReverseSplitNumber(int n){
        if (n/10 != 0){
            System.out.print(n%10 + " ");
            ReverseSplitNumber(n/10);
        }else {
            System.out.print(n + " ");
        }
    }

    //ex16 кол-во элементов, равных максимальному в последовательности
    public static void countOfMax(int max, int count){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n==0) {
            System.out.println(count);
            return;
        }
        if (n>max) {
            countOfMax(n, 1);
        } else if (n == max) {
            countOfMax(max, count + 1);
        } else {
            countOfMax(max, count);
        }
    }

    //ex17 найти максимум последовательности
    public static int getMax(){
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        if (n==0){
            return 0;
        } else {
            return Math.max(n, getMax());
        }
    }
    //ex1 Треугольная последовательность
    public static void triangleSequence(int k){
        if (k!=0){
            triangleSequence(k-1);
            for (int i = 0; i < k; i++) {
                System.out.print(k + " ");
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("Ex14: ");
        splitNumber(1234);
        System.out.println("\nEx15: ");
        ReverseSplitNumber(1234);
        System.out.println("\nEx16: ");
        countOfMax(0,0);
        System.out.println("Ex17: ");
        System.out.println(getMax());
        System.out.println("Ex1: ");
        triangleSequence(4);
    }
}
