package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.*;

/**
 * Компонент TextField з маскою
 * Клік по мітці показує прихований тект
 */
public class ex7_2 {
    public static void main(String[] args) {

        class TextFieldDemo extends Frame {
            public TextFieldDemo(String title) {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Мітка для відображення прихованого тексту
                Label label = new Label("Show password!",Label.CENTER);

                //Поле введення
                TextField textField = new TextField(10);
                textField.setText("pa$vvord");
                textField.setEchoChar('$');//установка маски

                add(label,"South");
                add(textField,"Center");

                pack();
                setVisible(true);

                //Призначення мітці обробника
                label.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                        label.setText(textField.getText());
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });

                //Обробник кнопки закривання форми
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        System.exit(0);
                    }
                });
            }
        }

        //Сценарій роботи
        new TextFieldDemo("TextFieldDemo");
    }
}
