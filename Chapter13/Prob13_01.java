import javax.swing.*;
import java.awt.*;


public class Prob13_01 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Android 이미지");
            this.setLayout(new GridLayout(3,3));

            ImageIcon[] img =new ImageIcon[9];

            for(int i=0;i<9;i++){
                img[i] = new ImageIcon("image/" + (i + 1) + ".png");
            }

            JButton[] btn = new JButton[9];

            for (int i = 0; i < 9; i++) {
                btn[i] = new JButton(img[i]);
                this.add(btn[i]);
            }

            setSize(300, 300);
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        new MyGUI();
    }
}
