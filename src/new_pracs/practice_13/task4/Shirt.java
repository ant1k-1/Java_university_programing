package new_pracs.practice_13.task4;

public class Shirt {
    private String article;
    private String model;
    private String color;
    private String size;
    Shirt(String str){
        String[] info = str.split(",");
        article = info[0];
        model = info[1];
        color = info[2];
        size = info[3];
    }

    @Override
    public String toString() {
        return "Article: " + article + ";\n" +
                "Model: " + model + ";\n" +
                "Color: " + color + ";\n" +
                "Size: " + size + ".";
    }
}
