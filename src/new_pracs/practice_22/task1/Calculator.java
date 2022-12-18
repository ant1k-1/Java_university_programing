package new_pracs.practice_22.task1;

import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator {

    public static double calculate(String expr) throws EmptyStackException, ArithmeticException{
        Double result = 0d;

        String currentPosition = "";
        Stack<Double> currentStack = new Stack<>();
        for(int i = 0; i < expr.length(); i++){
            if (isOperand(((Character)expr.charAt(i)).toString())){
                if (currentStack.size() < 2) throw new EmptyStackException();
                Double firstNum = currentStack.pop(), secondNum = currentStack.pop();
                switch(((Character)expr.charAt(i)).toString()){
                    case "+" : { result = firstNum + secondNum; break; }
                    case "-" : { result = secondNum - firstNum; break; }
                    case "*" : { result = firstNum * secondNum; break; }
                    case "/" : {
                        if (firstNum == 0) throw new ArithmeticException();
                        else  result =  secondNum / firstNum;
                        break;
                    }
                    default:
                        result = 0d;
                }
                currentStack.push(result);
            }
            else if (expr.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")){

                currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                currentPosition = "";
            }
            else{
                currentPosition += expr.charAt(i);
            }
        }
        if (currentStack.empty()) return 0d;
        else return currentStack.pop();
    }

    public static boolean isOperand(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }

    public static void main(String[] args) {
        System.out.println(calculate("2 4 6 + +"));
    }
}