package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Scrollbar як слайдер для встановлення розміру шрифту
 */
public class ex6_2 {
    public static void main(String[] args) {

        class ScrollbarDemo extends Frame {
            public ScrollbarDemo(String title)  {
                super(title);
                setSize(300,200);
                setLocation(200,300);

                //Створення слайдера
                Scrollbar scrollbar = new Scrollbar(Scrollbar.HORIZONTAL,10,2,0,50);

                TextArea textArea = new TextArea("Text");
                textArea.setFont(new Font("Arial",Font.BOLD,scrollbar.getValue()));

                add(scrollbar,"North");
                add(textArea,"Center");

                pack();
                setVisible(true);

                //Обробник клікання по лінійці
                scrollbar.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {

                        textArea.setFont(new Font("Arial",Font.BOLD,scrollbar.getValue()));
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                        textArea.setFont(new Font("Arial",Font.BOLD,scrollbar.getValue()));
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
        new ScrollbarDemo("ScrollbarDemo");
    }
}
