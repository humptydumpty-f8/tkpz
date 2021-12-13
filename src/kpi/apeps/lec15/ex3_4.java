package kpi.apeps.lec15;
/**
 * Записна книжка
 * Клас, який містить джерело події, сам здійснює обробку
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ex3_4 {
    public static void main(String[] args) {

        class NoteBook  extends Frame implements ActionListener{
            private TextField tf;
            private TextArea ta;

            public NoteBook (String title)  {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                tf=new TextField("Enter text", 50);
                add(tf, BorderLayout.NORTH);

                ta=new TextArea();
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

                tf.addActionListener(this);
                btn.addActionListener(this);
            }

            //Обробник в класі
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.append(tf.getText() + "\n");
            }

        }
        new NoteBook("NoteBook");
    }
}
