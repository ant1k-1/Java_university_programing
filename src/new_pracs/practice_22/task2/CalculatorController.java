package new_pracs.practice_22.task2;

import java.awt.event.ActionListener;
import java.util.EmptyStackException;

public class CalculatorController {
    private void setDefault(CalculatorModel model, CalculatorView view){
        model.setInput("");
        model.setOutput("");
        view.setTextUserInput("");
    }
    public CalculatorController(){
        CalculatorView view = new CalculatorView();
        CalculatorModel model = new CalculatorModel();
        ActionListener btnActionListener = e -> {
            if (e.getActionCommand().charAt(0) == 'C'){
                setDefault(model, view);
            } else if (e.getActionCommand().charAt(0) == '='){
                model.setInput(view.getTextUserInput());
                try{
                    model.calculate();
                }catch (EmptyStackException exception){
                    setDefault(model, view);
                    view.alertMessage("Стек пустой или некорректный ввод");
                }catch (ArithmeticException exception){
                    setDefault(model, view);
                    view.alertMessage("Деление на ноль!");
                }
                view.setTextUserInput(model.getOutput());
            } else if (e.getActionCommand().charAt(0) == '.') {
                view.setTextUserInput(view.getTextUserInput() + e.getActionCommand());
            } else if (view.getTextUserInput().length()!=0 && view.getTextUserInput().charAt(view.getTextUserInput().length()-1)=='.') {
                view.setTextUserInput((view.getTextUserInput()) + e.getActionCommand());
            } else{
                view.setTextUserInput((view.getTextUserInput())+ " " + e.getActionCommand());
            }
        };
        view.setActionListener(btnActionListener);
    }
}
