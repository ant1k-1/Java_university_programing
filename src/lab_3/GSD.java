package lab_3;

public class GSD extends Dog{

    public GSD(String name, int age) {
        super(name, age);
    }
    @Override
    public void showBreed(){
        System.out.println("Breed - German shepherd dog");
    }

    @Override
    public String toString() {
        return "GSD{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
