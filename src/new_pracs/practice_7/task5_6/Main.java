package new_pracs.practice_7.task5_6;
//5. Разработайте интерфейс для работы со строками, который содержит
//а) функции подсчета символов в строке б) функция возвращает строку, которая
//образовывает строку, состоящую из символов исходной строки s, которые
//размещены на нечетных позициях: 1, 3, 5, ...в) функцию инвертирования строки
//6. Реализуйте интерфейс в классе ProcessStrings и протестируйте
//работу класса
public class Main {
    public static void main(String[] args) {
        String str = "Some string!";
        ProcessStrings processStrings = new ProcessStrings();
        System.out.println("Length: " + processStrings.getLength(str));
        System.out.println("Odd chars: " + processStrings.getOdd(str));
        System.out.println("Reverse: " + processStrings.getReverse(str));
    }
}
