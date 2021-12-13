package kpi.apeps.lec16;

/**
 * Формування основного вікна програми за допомогою конструктора
 */

import javax.swing.*;

//Наслідування класу JFrame
public class ex1_2 extends JFrame {

    public ex1_2() {
        super("Title");//визначення заголовку вікна
        setSize(300, 300);//визначення ненульових розмірів вікна
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//завершити додаток при натисненні кнопки закривання
        setVisible(true);//візуалізація вікна
    }

    public static void main(String[] args) {

        new ex1_2();//створення вікна
    }
}
