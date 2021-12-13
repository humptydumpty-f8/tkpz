package kpi.apeps.lec14;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Компонент Label: динамічні ефекти
 */
public class ex1_2 {
    public static void main(String[] args) {

        class LabelDemo extends Frame {
            private Label labeltypeWriter;
            private Label labelBlink;
            private Label labelMult;

            public LabelDemo(String title) {
                super(title);
                setSize(300, 200);
                setLocation(200, 300);

                //Створення таблиці 3х1 для розміщення міток
                GridLayout gridLayout = new GridLayout();
                gridLayout.setColumns(1);
                gridLayout.setRows(3);
                gridLayout.setVgap(10);
                gridLayout.setHgap(20);
                setLayout(gridLayout);

                //Створення міток
                labeltypeWriter = new Label();//демонструє ефект друкування тексту
                labelBlink = new Label("Мерехтіння");//демонструє ефект мерехтіння
                labelMult = new Label("Розчинення", Label.CENTER);//демонструє ефект розчинення тексту

                //Розміщення міток в таблиці
                add(labeltypeWriter);
                add(labelBlink);
                add(labelMult);

                pack();//упаковка компонентів

                setVisible(true);//візуалізація форми

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
        var labelDemo = new LabelDemo("LabelDemo");//відкрити форму

        //Ефект друкування
        String title = "Текст що друкується";
        String labelText = "";
        for (int i = 0; i < title.length(); i++) {
            labelText += title.charAt(i);
            labelDemo.labeltypeWriter.setText(labelText);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Ефект мерехтіння
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0) {
                labelDemo.labelBlink.setForeground(new Color(0, 0, 0));
            } else {
                labelDemo.labelBlink.setForeground(new Color(255, 255, 255));
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //Ефект розчинення
        for (int i = 0; i < 255; i += 20) {
            labelDemo.labelMult.setForeground(new Color(i, i, i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
