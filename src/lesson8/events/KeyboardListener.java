package lesson8.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KeyboardListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Действие!");
    }
}
