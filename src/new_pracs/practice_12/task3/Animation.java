package new_pracs.practice_12.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
//Создать окно, реализовать анимацию, с помощью картинки,
//состоящей из нескольких кадров
public class Animation extends JFrame {
    public Animation() throws Exception{
        super("Frames");
        setLayout(new BorderLayout());
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String path = "C:/Users/Anton/Desktop/Java_university_programing/src/new_pracs/practice_12/task3/frames/frame_";
        String origin = path;
        ArrayList<Image> frames = new ArrayList<>();
        for (int i = 0; i < 180; i++) {
            if (i < 10) {
                path += "00" + i + "_delay-0.01s.png";
            } else if (i < 100){
                path += "0" + i + "_delay-0.01s.png";
            }
            else path += i + "_delay-0.01s.png";
            frames.add(ImageIO.read(new File(path)));
            path = origin;
        }

        JToggleButton btn = new JToggleButton("Start"); //кнопка переключатель

        btn.setFont(new Font("Times New Roman", Font.BOLD, 64));
        JPanel jPanel = new JPanel(new BorderLayout());
        JLabel jLabel = new JLabel(new ImageIcon(frames.get(0)));
        add(jLabel, BorderLayout.CENTER); //добавляем картинки
        jPanel.add(btn, BorderLayout.CENTER);
        add(jPanel, BorderLayout.SOUTH); //добавляем кнопку

        ActionListener animate = new ActionListener() { //слушатель для анимации
            int index = 0;
            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.size() - 1) {
                    index++;
                } else {
                    index = 0;
                }
                jLabel.setIcon(new ImageIcon(frames.get(index)));
            }
        };
        Timer timer = new Timer(25, animate); //таймер обновления картинок-анимации

        btn.addActionListener(new ActionListener() { //слушатель кнопки
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setText("Stop");
                    timer.start(); //запускаем анимацию
                } else {
                    btn.setText("Start");
                    timer.stop(); //останавливаем анимацию
                }
            }
        });

    }
    public static void main(String[] args) throws Exception {
        new Animation().setVisible(true);
    }
}
