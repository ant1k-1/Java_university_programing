package new_pracs.practice_3.mathAndRandom.task2;

//Создать класс точка Point, описывающий точку на плоскости.
//Создать Circle класс, в котором одно поле представляет точку – центр
//окружности, и добавить другие свойства, позволяющие задать точку на
//плоскости. Создать третий класс Tester который использует для хранения
//объектов массив объектов Circle и второе поле количество элементов в массиве.
//Добавить в класс методы, позволяющие найти самую маленькую и самую
//большую окружность. Добавить в класс метод, упорядочивающий хранение
//окружностей в массив. Для инициализации полей радиуса и длины окружности
//используйте класс Random или метод random() класса Math по желанию

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester(10);
        System.out.println("Min circle: " + tester.findMin());
        System.out.println("Max circle: " + tester.findMax());
        System.out.println("Unsorted: " + tester);
        tester.sort();
        System.out.println("Sorted:   " + tester);
    }
}
