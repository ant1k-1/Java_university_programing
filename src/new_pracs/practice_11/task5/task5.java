package new_pracs.practice_11.task5;

//Сравнить время выполнения кода в реализации кода в виде различных
//структур данных из предыдущих заданий (сравнить ArrayList и LinkedList по
//производительности – операции вставки, удаления, добавления и поиска по
//образцу
import java.util.ArrayList;
import java.util.LinkedList;

public class task5 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        long startTime = System.nanoTime();
        arrayList.add(100001);
        arrayList.add(10000, 100002);
        arrayList.remove(10000);
        arrayList.indexOf(59999);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);
        System.out.println("ArrayList: " + duration);

        startTime = System.nanoTime();
        linkedList.add(100001);
        linkedList.add(10000, 100002);
        linkedList.remove(10000);
        linkedList.indexOf(59999);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("LinkedList: " + duration);
    }
}
