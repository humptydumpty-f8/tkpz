package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Scrollbar як слайдер
 */
public class ex6_1 {
    public static void main(String[] args) {

        class ScrollbarDemo extends Frame {
            public ScrollbarDemo(String title)  {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(1);
                gridLayout.setRows(2);
                gridLayout.setVgap(10);
                gridLayout.setHgap(20);
                setLayout(gridLayout);

                //Створення лінійки прокручування
                Scrollbar scrollbar = new Scrollbar(Scrollbar.HORIZONTAL, 12, 1, 10, 24);

                Label label = new Label("Text", Label.CENTER);
                label.setText(Integer.toString(scrollbar.getValue()));

                add(scrollbar);
                add(label);

                pack();
                setVisible(true);

                //Обробник клікання по лінійці
                scrollbar.addMouseListener(new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        label.setText(Integer.toString(scrollbar.getValue()));
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        scrollbar.setBackground(new Color(0, 255, 0));
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {scrollbar.setBackground(new Color(255, 255, 255));

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
