package com.duala.UI;

import com.duala.Objects.Bus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBus extends JFrame{
    private JTextField driverName;
    private JTextField plate;
    private JTextField destination;
    private JButton cancelbtn;
    private JButton addbtn;
    private JPanel panel;

    private StationTerminalUI parent;

    public AddBus(StationTerminalUI term) {
        this.parent = term;
        add(panel);
        pack();
        setVisible(true);

        /**
         * Adds a bus to the number of buses at the station
         */
        addbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                parent.station.addFirst( new Bus(plate.getText(),destination.getText(), driverName.getText()) );
                dispose();

            }
        });


        /**
         * Cancels the addition of buses
         */
        cancelbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });




    }

    @Override
    public void dispose() {
        super.dispose();
    }
}
