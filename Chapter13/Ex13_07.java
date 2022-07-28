//스윙 컴포넌트 사용 예

import java.awt.*;
import javax.swing.*;


public class Ex13_07 {
    static class MyGUI extends JFrame {
        MyGUI(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("컴포넌트 연습1");

            Container c = this.getContentPane();
            c.setBackground(Color.YELLOW);


            this.setLayout(new FlowLayout());
            JToggleButton btn1 = new JToggleButton();
            btn1.setBackground(Color.BLACK);
            btn1.setForeground(Color.MAGENTA);
            this.add(btn1);

            JButton btn2 = new JButton("버튼2");
            btn2.setFont(new Font("맑은고딕", Font.BOLD, 30));
            btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR));
            btn2.setToolTipText("이 버튼은 크게 보여요~~");
            this.add(btn2);

            JCheckBox btn3 = new JCheckBox("버튼3");
            btn3.setEnabled(false);
            this.add(btn3);

            setSize(256, 256);
            setVisible(true);

        }
    }
    public static void main(String[] args) {
        new MyGUI();
    }
}
