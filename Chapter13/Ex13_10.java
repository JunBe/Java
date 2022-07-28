//Jlist,JComboBox사용예

import java.awt.*;
import javax.swing.*;

public class Ex13_10 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("컴포넌트 연습4");

            this.setLayout(new FlowLayout());

            String[] pet = {"고양이", "강아지", "토끼", "코알라", "송아지","cat","dog","rabbit","koala","cow"};

            JList list = new JList(pet);
            this.add(list);
            this.add(new JScrollPane(list));

            JComboBox combo = new JComboBox(pet);
            this.add(combo);

            setSize(200, 200);
            setVisible(true);

        }
    }
    public static void main(String[] args) {
        new MyGUI();
    }
}
