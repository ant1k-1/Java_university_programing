package new_pracs.practice_13.task3;

//Задание 3. (15%) Доработать класс адреса, который из полученной строки
//формата “Страна[d] Регион[d] Город[d] Улица[d] Дом[d] Корпус[d] Квартира”
//([d] – разделитель, например, «запятая») выбирает соответствующие части и
//записывает их в соответствующие поля класса Address. Учесть, что в начале и
//конце разобранной части адреса не должно быть пробелов. Все поля адреса
//строковые. Разработать проверочный класс не менее чем на четыре адресных
//строки. В программе предусмотреть две реализации этого метода:
//а) разделитель – только запятая (использовать метод split()); Внимание, при
//разработке нужно учесть, что
//б) разделитель – любой из символов ‘,’ ‘.’ ‘;’ - (класс StringTokenizer8
//).
public class Main {
    public static void main(String[] args) {
        Address first = new Address("Russia, MOSCOW, Moscow, Lenina, 12, 2, 23", false);
        Address second = new Address("Russia, MOSCOW, Moscow, Lenina, 12, 2, 23", true);
        Address third = new Address("Russia; MOSCOW; Moscow; Lenina; 12; 2; 23", true);
        Address fourth = new Address("Russia. MOSCOW. Moscow. Lenina. 12. 2. 23", true);
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);
    }
}
