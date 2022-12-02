package new_pracs.practice_12.task3;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

public class Animation extends JFrame {
    public Animation() throws Exception{
        super("Frames");
        setLayout(new BorderLayout());
        setSize(1080, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(Color.WHITE);
        String path = "D:/me/University/Java/frames/frame_";
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


        BufferedImage img = null;

        JToggleButton btn = new JToggleButton("Start");
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.gray);
        btn.setFocusPainted(false);
        btn.setFont(new Font("Times New Roman", Font.BOLD, 32));
        JPanel jp = new JPanel(new BorderLayout());
        JLabel label = new JLabel(new ImageIcon(frames.get(0)));
        add(label, BorderLayout.CENTER);
        jp.add(btn, BorderLayout.CENTER);
        add(jp, BorderLayout.NORTH);

        ActionListener animate = new ActionListener() {

            public int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.size() - 1) {
                    index++;
                } else {
                    index = 0;
                }
                label.setIcon(new ImageIcon(frames.get(index)));
            }
        };
        final Timer timer = new Timer(25, animate);
        Border emptyBorder = BorderFactory.createEmptyBorder();
        btn.setBorder(emptyBorder);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (btn.isSelected()) {
                    btn.setText("Stop");
                    timer.start();
                    btn.setForeground(Color.WHITE);
                } else {
                    btn.setText("Start");
                    timer.stop();
                    btn.setForeground(Color.gray);
                }

            }
        });
        UIManager.put("ToggleButton.select", Color.BLACK);
        SwingUtilities.updateComponentTreeUI(btn);
    }

    public static void main(String[] args) throws Exception {
        new Animation().setVisible(true);
    }
}
