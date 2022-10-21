package old.lab_7;
import java.util.LinkedList;

//2. Протестировать работу коллекции LinkedList.
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> states = new LinkedList<String>();

        // добавим в список ряд элементов
        states.add("German");
        states.add("France");
        states.addLast("Great Britain"); // добавляем на последнее место
        states.addFirst("Spain"); // добавляем на первое место
        states.add(1, "Italy"); // добавляем элемент по индексу 1

        System.out.printf("List has %d elements \n", states.size());
        System.out.println("first element is "+ states.get(1));
        states.set(1, "Russia");
        System.out.println("after set: first element is "+ states.get(1));
        System.out.println("ALL LIST:");
        for(String state : states){

            System.out.println(state);
        }
        // проверка на наличие элемента в списке
        if(states.contains("German")){

            System.out.println("\nList has a German state");
        }

        states.remove("German");
        states.removeFirst(); // удаление первого элемента
        states.removeLast(); // удаление последнего элемента

        System.out.println("\nALL LIST:");
        for(String state : states){

            System.out.println(state);
        }
    }
}


