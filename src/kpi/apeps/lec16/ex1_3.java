package kpi.apeps.lec16;

/**
 * Рекомендований спосіб формування основного вікна програми за допомогою конструктора
 * і запуску в потоці диспетчеризації подій
 */

import javax.swing.*;

//Наслідування класу JFrame
public class ex1_3 extends JFrame {

    public ex1_3() {
        super("Title");//визначення заголовку вікна
        setSize(300, 300);//визначення ненульових розмірів вікна
        setIconImage(getToolkit().getImage("src/kpi/apeps/lec11/Herald_of_NTUU_KPI_logo.svg.png"));//заміна іконки
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//завершити додаток при натисненні кнопки закривання
        setVisible(true);//візуалізація вікна
    }

    public static void main(String[] args) {

        //Створити вікно в потоці диспетчеризації подій
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex1_3();//створення вікна
            }
        });
    }
}
