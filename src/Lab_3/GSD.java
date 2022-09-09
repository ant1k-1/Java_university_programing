package Lab_3;

public class GSD extends Dog{
    private String breed;

    public GSD(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
    public void showBreed(){
        System.out.println("German shepherd dog");
    }

    @Override
    public String toString() {
        return "GSD{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
