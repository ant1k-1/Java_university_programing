package new_pracs.practice_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

//Напишите класс SortingStudentsByGPA (может у вас называться Tester
//или Main, так как содержит функцию main()) создайте поле как массив
//объектов Student с названием iDNumber, вы можете использовать как массив,
//так и и ArrayList или TreeSet для хранения данных о студентах
//Добавьте методы класса: 1) заполнения массива setArray() 2) метод для
//сортировки по среднему баллу студентов quicksort() который реализует
//интерфейс Comparator таким образом, чтобы он сортировал студентов с их
//итоговым баллом в порядке убывания. В качестве алгоритма сортировки
//использовать методы сортировок: слиянием и быструю сортировку (добавьте в
//класс еще один метод). 3)метод для вывода массива студентов outArray()
//4)Добавьте в класс возможность сортировать список студентов по другому полю
//Напишите программу, которая объединяет два списка данных о студентах
//в один отсортированный списках.

public class Tester{
    public static void main(String[] args) {
        Student[] StudentsList = new Student[10];
        Student[] StudentsListFirst = new Student[10];
        Student[] StudentsListSecond = new Student[10];

        Comparator<Student> comparatorGpa = new Student(1);
        Comparator<Student> comparatorCourse = new Student(2);


        System.out.println("First quick sort:\n");
        System.out.println("Basic array: \n");
        setArray(StudentsList, 10);
        outArray(StudentsList);
        quickSort(StudentsList, StudentsList.length - 1, 0, comparatorGpa);
        System.out.println("\nSorted array: \n");
        outArray(StudentsList);

        System.out.println("\nSecond merge sort:\n");
        System.out.println("Basic array: \n");
        setArray(StudentsList, 10);
        outArray(StudentsList);
        System.out.println("\nSorted array: \n");
        mergeSort(StudentsList, StudentsList.length, comparatorGpa);
        outArray(StudentsList);

        System.out.println("\nThird quick sort another comparator:\n");
        System.out.println("Basic array: \n");
        setArray(StudentsList, 10);
        outArray(StudentsList);
        quickSort(StudentsList, StudentsList.length - 1, 0, comparatorCourse);
        System.out.println("\nSorted array: \n");
        outArray(StudentsList);

        System.out.println("\nFourth merging to arrays:\n");
        System.out.println("Basic arrays: \n");
        setArray(StudentsListFirst, 10);
        setArray(StudentsListSecond, 10);
        outArray(StudentsListFirst);
        System.out.println("----------");
        outArray(StudentsListSecond);
        System.out.println("\nSorted arrays: \n");
        Student[] allStudents = new Student[StudentsListFirst.length + StudentsListSecond.length];
        System.arraycopy(StudentsListFirst, 0, allStudents,0,StudentsListFirst.length);
        System.arraycopy(StudentsListSecond, 0, allStudents,StudentsListSecond.length, StudentsListSecond.length);
        mergeSort(allStudents, allStudents.length, comparatorCourse);
        outArray(allStudents);
    }

    public static void setArray(Student[] studentsList, int amount){
        for(int i =0; i < amount; i++){
            studentsList[i] = new Student("Name "+i, "Surname" + 1, "Some speciality", i % 4 + 1, "Some group", new Random().nextInt(0,40));
        }
    }

    public static void outArray(Student[] studentsList){
        for (int i = 0; i < studentsList.length; i++){
            System.out.println(studentsList[i]);
        }
    }
    public static void quickSort(Object[] array, int high, int low, Comparator comp){
        if(array == null || array.length == 0) return;
        if(high <= low) return;

        Object middle = array[(low + high)/2];
        ArrayList<Object> left = new ArrayList<>();
        ArrayList<Object> right = new ArrayList<>();
        ArrayList<Object> eq = new ArrayList<>();
        for(int i = low; i <= high; i++){
            if(comp.compare(array[i], middle) > 0){
                right.add(array[i]);
            }
            else if (comp.compare(array[i], middle) < 0)
                left.add(array[i]);
            else eq.add(array[i]);
        }
        Object[] leftArr;
        Object[] rightArr;
        if(left.size()>0) {
            leftArr = left.toArray();
            quickSort(leftArr, left.size() - 1, 0, comp);
            System.arraycopy(leftArr, 0, array, low, left.size());
        }
        System.arraycopy(eq.toArray(), 0, array, low+left.size(), eq.size());

        if(right.size() > 0) {
            rightArr = right.toArray();
            quickSort(rightArr, right.size() - 1, 0, comp);
            System.arraycopy(rightArr, 0, array, low+left.size() + eq.size(), right.size());
        }

    }

    public static void mergeSort(Student[] a, int n, Comparator comp) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        System.arraycopy(a, 0, l, 0, mid);
        System.arraycopy(a, mid, r, 0, n - mid);
        mergeSort(l, mid, comp);
        mergeSort(r, n - mid, comp);

        merge(a, l, r, mid, n - mid, comp);
    }
    public static void merge(
            Student[] a, Student[] l, Student[] r, int left, int right, Comparator comp) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            //comp.compare(l[i], r[j])
            //l[i].compareTo(r[j])
            if (comp.compare(l[i], r[j]) <= 0) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
}
