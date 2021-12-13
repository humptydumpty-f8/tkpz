package kpi.apeps.lec15;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * Записна книжка
 * Обробники реалізовані як методи окремого класу-слухача.
 * Екземпляри слухача  створюються тільки при виникненні події
 */
public class ex3_2 {
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

                //Екземпляри слухача  створюються тільки при виникненні події
                tf.addActionListener(new TextMove(tf,ta));
                btn.addActionListener(new TextMove(tf,ta));
            }

            //Клас слухача
            class TextMove implements ActionListener {
                private TextField tf;
                private TextArea ta;

                TextMove(TextField tf, TextArea ta) {
                    this.tf = tf;
                    this.ta = ta;
                }

                public void actionPerformed(ActionEvent ae) {
                    ta.append(tf.getText() + "\n");
                }

            }
        }
        new NoteBook("NoteBook");
    }
}
