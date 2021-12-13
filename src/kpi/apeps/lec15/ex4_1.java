package kpi.apeps.lec15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

/**
 * Стрибаючі кнопки
 * Використовується окремий клас-слухач
 */
public class ex4_1 {
    public static void main(String[] args) {

        class JumpingWindowDemo extends Frame {
            public JumpingWindowDemo(String title) throws HeadlessException {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                setLayout(null);
                Button btn = new Button("Press me!");
                btn.setBounds(120, 30, 80, 30);
                btn.addActionListener(new JumpingWindow());
                add(btn);

                Button btn1 = new Button("And me!");
                btn1.setBounds(120, 30, 80, 30);
                btn1.addActionListener(new JumpingWindow());
                add(btn1);

                pack();
                setVisible(true);

                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }

            class JumpingWindow implements ActionListener {
                private int x, y;
                private Button btn;
                private Random rnm = new Random();

                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() instanceof Button) btn = (Button) e.getSource();
                    x = rnm.nextInt(200);
                    y = rnm.nextInt(100);
                    btn.setBounds(x, y, 80, 30);
                }
            }
        }
        new JumpingWindowDemo("JumpingWindowDemo");
    }
}
