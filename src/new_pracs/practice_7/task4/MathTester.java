package new_pracs.practice_7.task4;
// Разработайте интерфейс MathCalculable, который содержит
//объявления математических функций: возведения в степень и модуль
//комплексного числа, также содержит число PI. Напишите класс MathFunc,
//который реализует, реализует этот интерфейс. Например, вычисления длины
//окружности, для чего используйте число PI из интерфейса. Протестируйте класс
public class MathTester {
    public static void main(String[] args) {
        MathFunc math = new MathFunc();
        System.out.println("R = 3.5, P = " + math.CircleLength(3.5));
        System.out.println("z = 3 + 7i, |z| = " + math.complexAbs(3, 7));
        System.out.println("2.5^4 = " + math.pow(2.5, 4));
    }
}
