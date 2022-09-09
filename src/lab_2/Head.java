package lab_2;

public class Head {
    private String hairColor;
    public Head() {};

    public Head(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public void thinking(){
        System.out.println("Neuron activation...");
    }

    @Override
    public String toString() {
        return "Head{" +
                "hairColor='" + hairColor + '\'' +
                '}';
    }
}
