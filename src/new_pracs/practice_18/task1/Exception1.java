package new_pracs.practice_18.task1;

public class Exception1 {
    public void exceptionDemo(){
        try {
            System.out.println(2/0);
        }catch (ArithmeticException e){
            System.out.println("Attempted division by zero");
        }

    }
    //1 - необработанная ошибка
    //2.0/0.0 - будет Infinity
    //теперь прога не остановилась, а обработала исключение и успешно завершила работу
    public static void main(String[] args) {
        Exception1 exception1 = new Exception1();
        exception1.exceptionDemo();
    }
}
