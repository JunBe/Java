import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Prob13_03 {
    static class MyGUI extends JFrame {
        MyGUI() {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("메뉴 처리");
            this.setLayout(new GridLayout(3,3));
            ImageIcon[] img =new ImageIcon[9];
            JButton[] btn = new JButton[9];

            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    getContentPane().removeAll();
                    int randNum[] = makeRandom();
                    for(int i=0;i<9;i++){
                        img[i] = new ImageIcon("image/" + (randNum[i]+1) + ".png");
                        btn[i] = new JButton(img[i]);
                        MyGUI.this.add(btn[i]);
                    }
                    validate();
                }
            });

            JMenuBar menuBar = new JMenuBar();

            JMenu myMenu = new JMenu("내 메뉴");

            JMenuItem imageItem = new JMenuItem("이미지 섞기");
            JMenuItem closeItem = new JMenuItem("닫기");

            setJMenuBar(menuBar);
            menuBar.add(myMenu);
            myMenu.add(imageItem);
            myMenu.addSeparator();
            myMenu.add(closeItem);

            imageItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    try{
                        Robot robot = new Robot();
                        robot.keyPress(KeyEvent.VK_SPACE);
                    }catch (Exception e){

                    }
                }
            });

            closeItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    System.exit(0);
                }
            });

            setSize(200, 200);
            setVisible(true);

        }
    }

    public static int[] makeRandom() {
        int[] rand = {-1 ,- 1, -1, -1, -1, -1, -1, -1,-1};
        int i,k,num;
        char dupl = 'N';
        for (i = 0; i < 9; ) {
            num = (int) ((Math.random() * 9));

            for (k = 0; k < 9; k++) {
                if (rand[k] == num) {
                    dupl = 'Y';
                }
            }

            if (dupl == 'N') {
                rand[i++] = num;
            } else {
                dupl = 'N';
            }

        }
        return rand;
    }

    public static void main(String[] args) {
        new MyGUI();
    }
}
