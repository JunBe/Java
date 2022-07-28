//툴바 구현

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ex13_15 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("툴바 만들기");
            this.setLayout(new FlowLayout());

            JToolBar toolBar = new JToolBar();

            JButton newItem = new JButton("새 문서");
            JButton openItem = new JButton("열기");
            JButton closeItem = new JButton(new ImageIcon("image/kakao.png"));

            add(toolBar, BorderLayout.NORTH);
            toolBar.add(newItem);
            toolBar.add(openItem);
            toolBar.addSeparator(new Dimension(20, 10));
            toolBar.add(closeItem);

            JLabel lbl = new JLabel("이 글자가 바뀝니다");
            this.add(lbl);

            newItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lbl.setText("[새 문서]를 선택했습니다.");
                }
            });

            openItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    lbl.setText("[열기]를 선택했습니다.");
                }
            });

            closeItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);

                }
            });

            JMenuBar menuBar = new JMenuBar();

            JMenu fileMenu = new JMenu("파일");
            JMenu editMenu = new JMenu("편집");

            JMenuItem newItem2 = new JMenuItem("새 문서");
            JMenuItem openItem2 = new JMenuItem("열기");
            JMenuItem closeItem2 = new JMenuItem("닫기");

            setJMenuBar(menuBar);

            menuBar.add(fileMenu);
            menuBar.add(editMenu);

            fileMenu.add(newItem2);
            fileMenu.add(openItem2);
            fileMenu.addSeparator();
            fileMenu.add(closeItem2);
            newItem2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    lbl.setText("[새문서]를 선택했습니다");
                }
            });

            openItem2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    lbl.setText("[열기]를 선택했습니다");
                }
            });

            closeItem2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    System.exit(0);
                }
            });
            setSize(300, 200);
            setVisible(true);
        }
    }
    public static void main(String[] args) {
        new MyGUI();
    }
}
