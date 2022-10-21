package lab_8;

import java.io.FileReader;
import java.io.IOException;

//Реализовать вывод информации из файла на экран
public class FilesApp {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader(System.getProperty("user.dir") + "\\src\\lab_8\\example.txt")){
            int c;
            while((c=reader.read())!=-1){
                System.out.print((char)c);
            }
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
