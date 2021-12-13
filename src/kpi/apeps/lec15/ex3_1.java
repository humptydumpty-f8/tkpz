package kpi.apeps.lec15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Записна книжка
 * Обробники реалізовані як методи анонімного класу
 */
public class ex3_1 {
    public static void main(String[] args) {

        class NoteBook  extends Frame {
            public NoteBook (String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                TextField tf=new TextField("Enter text", 50);
                add(tf, BorderLayout.NORTH);

                TextArea ta=new TextArea();
                ta.setEditable(false);
                add(ta,BorderLayout.CENTER);

                Panel pnl=new Panel();
                add(pnl,BorderLayout.SOUTH);

                Button btn=new Button("Enter");
                pnl.add(btn);
                pack();
                setVisible(true);

                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });

                //Обробник натиснення Enter в текстовому полі
                tf.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ta.append(tf.getText() + "\n");
                    }
                });

                //Обробник кліку по кнопці
                btn.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        ta.append(tf.getText() + "\n");
                    }
                });
            }
        }
        new NoteBook("NoteBook");
    }
}
