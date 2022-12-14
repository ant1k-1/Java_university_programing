package new_pracs.practice_7.task1_3;
//Добавьте в класс параметризированные конструкторы, входящие в
//состав классов; метод в классах для перевода числовых значений в Строку.
//Убедитесь, что две точки имеют одну и ту же скорость при помощи специального
//логического метода SpeedTest(), проверяющего это.
public class TesterMoves {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 1, 5 ,5, 1,1);
        System.out.println("Checking validity of points' speed: " + rectangle.isValidMovement());
        System.out.println("Before: "+ rectangle.toString());
        System.out.println("MOVE UP");
        rectangle.moveUp();
        System.out.println("After: "+rectangle.toString());
    }
}
