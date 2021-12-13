package kpi.apeps.lec16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Компонент JPopupMenu
 * В контекстному меню відображаються команди для вкл/викл прапорця
 * Командам призначені швидкі і "гарячі клавіші". Показана можливість блокування команд
 */
public class ex3_5 extends JFrame {

    private JCheckBox jCheckBox;

    public ex3_5() {
        super("PopupMenu");
        setSize(300, 300);
        setLocation(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Додаєм панель і розміщуємо її по центру
        JPanel jPanel = new JPanel();
        add(jPanel);

        // Додаємо JCheckBox в панель
        jCheckBox = new JCheckBox("On/Off");
        jPanel.add(jCheckBox);

        //Створюємо контекстне меню
        var  popup  =  new  JPopupMenu();

        //Додаємо команди в меню
        var  onItem  =  new  JMenuItem("On");
        onItem.setMnemonic('N');//Призначаэмо клавішу швидкого доступу
        onItem.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));//Призначаэмо "гарячу" клавішу
        popup.add(onItem);

        var  offItem  =  new  JMenuItem("Off");
        offItem.setMnemonic('f');
        offItem.setAccelerator(KeyStroke.getKeyStroke("ctrl F"));
        popup.add(offItem);

        // Призначаємо контекстне меню панелі
        jPanel.setComponentPopupMenu(popup);

        setVisible(true);

        // Додаємо обробники команд контекстного меню

        onItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jCheckBox.setSelected(true);
                onItem.setEnabled(false);//зробити неактивним
                offItem.setEnabled(true);//зробити активним
            }
        });

        offItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jCheckBox.setSelected(false);
                offItem.setEnabled(false);
                onItem.setEnabled(true);
            }
        });
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ex3_5();//створення вікна
            }
        });
    }
}
