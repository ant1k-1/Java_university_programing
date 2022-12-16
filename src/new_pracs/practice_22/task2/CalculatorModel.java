package new_pracs.practice_22.task2;

import java.util.EmptyStackException;
import java.util.Stack;

public class CalculatorModel {

    private String input;
    private String output;

    public CalculatorModel() {
        this.input = "";
        this.output = "";
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public double calculate() throws EmptyStackException, ArithmeticException{
        Double result = 0d;

        String currentPosition = "";
        Stack<Double> currentStack = new Stack<>();
        for(int i = 0; i < input.length(); i++){
            if (isOperand(((Character)input.charAt(i)).toString())){
                if (currentStack.size() < 2) throw new EmptyStackException();
                Double firstNum = currentStack.pop(), secondNum = currentStack.pop();
                switch(((Character)input.charAt(i)).toString()){
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
            else if (input.charAt(i) == ' ' && !currentPosition.replace(" ", "").equals("") && !currentPosition.replace(" ", "").equals(".")){

                currentStack.push(Double.parseDouble(currentPosition.replace(" ", "")));
                currentPosition = "";
            }
            else{
                currentPosition += input.charAt(i);
            }
        }
        if (currentStack.empty()) return 0d;
        else return currentStack.pop();
    }
    public boolean isOperand(String str){
        return str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/");
    }
}
