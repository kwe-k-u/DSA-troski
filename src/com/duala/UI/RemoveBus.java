package com.duala.UI;

import com.duala.Objects.Bus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RemoveBus extends JFrame{
    private JTextField plateNumber;
    private JLabel txt;
    private JButton removeButton;
    private JButton cancelButton;
    private JPanel panel;

    public RemoveBus(StationTerminalUI parent) {
        add(panel);
        setSize(420,550);
        setVisible(true);

        /**
         * Removes the bus that matches  the entered plate number from the station list
         */
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.station.remove(new Bus(plateNumber.getText().trim()));
                dispose();
            }
        });


        /**
         * Cancels the operation
         */
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });
    }
}
