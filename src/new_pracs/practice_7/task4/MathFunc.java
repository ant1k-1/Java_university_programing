package new_pracs.practice_7.task4;

public class MathFunc implements MathCalculable{

    public MathFunc(){}
    @Override
    public double pow(double number, int pow) {
        double temp = 1.0;
        for (int i = 1; i < pow + 1; i++) {
            temp*=number;
        }
        return temp;
    }

    @Override
    public double complexAbs(double x, double y) {
        return Math.sqrt(Math.abs(x*x) + Math.abs(y*y));
    }

    public double CircleLength(double radius){
        return 2.0 * MathCalculable.PI *radius;
    }
}
