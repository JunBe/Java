//JToggleButton,JButton,JCheckBox,JRadioButton 사용 예

import java.awt.*;
import javax.swing.*;

public class Ex13_08 {
    static class MyGUI extends JFrame{
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("컴포넌트 연습 2");

            this.setLayout(new FlowLayout());

            ImageIcon img1 = new ImageIcon("image/kakao.png");
            ImageIcon img2 = new ImageIcon("image/naver.png");

            JButton btn1 = new JButton("버튼1", img1);
            this.add(btn1);

            JLabel lbl1 = new JLabel("레이블1입니다.");
            JLabel lbl2 = new JLabel(img2);
            this.add(lbl1);
            this.add(lbl2);

            JCheckBox chk1 = new JCheckBox("C++");
            JCheckBox chk2 = new JCheckBox("Java");
            JCheckBox chk3 = new JCheckBox("C#", true);
            this.add(chk1);
            this.add(chk2);
            this.add(chk3);

            JRadioButton rdo1 = new JRadioButton("고래");
            JRadioButton rdo2 = new JRadioButton("상어");
            JRadioButton rdo3 = new JRadioButton("새우");
            this.add(rdo1);
            this.add(rdo2);
            this.add(rdo3);

            ButtonGroup grp = new ButtonGroup();
            grp.add(rdo1);
            grp.add(rdo2);
            grp.add(rdo3);

            setSize(200, 300);
            setVisible(true);

        }
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
