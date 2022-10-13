package Lab_5;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class ShowPicture extends JFrame {
    ImageIcon img1 = new ImageIcon();
    JLabel jlabel = new JLabel(img1);
    public ShowPicture(){
        super("Show picture");
        setSize(500, 500);
        setLayout(new BorderLayout());
        add(jlabel, BorderLayout.CENTER);
        setVisible(true);
    }
    void updateImage(){
        System.out.println("Enter path to pic: ");
        Scanner scan = new Scanner(System.in);
        String path = scan.nextLine();
        jlabel.setIcon(new ImageIcon(new ImageIcon(path.substring(1)).getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT)));
        setBounds(250,250,600,600);
        add(jlabel, BorderLayout.CENTER);

    }
    void Listen(){
        while (true){
            this.updateImage();
        }
    }
    public static void main(String[] args) {
        new ShowPicture().Listen();
    }
}
