package com.duala.UI;

import com.duala.Objects.Bus;
import com.duala.Objects.Person;
import com.duala.Objects.StationTerminal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPassenger extends JFrame {

    private JButton bookSeatButton;
    private JTextField passName;
    private JTextField passDestination;
    private JComboBox availableBuses;
    private JPanel addPassengerPanel;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;
    private JButton cancel;


    private StationTerminalUI caller;


    public AddPassenger(StationTerminalUI caller){


        availableBuses.addItem("test");
        availableBuses.addItem("test1");
        availableBuses.addItem("test12");
        this.caller = caller;


        /**
         * A click listener on BOOK SEAT button on the interface.
         * This adds a passenger to the next available bus at the station.
         */
        bookSeatButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //get information from form
                //create a passenger class
                // add to assigned vehicle
                //close window and open some other window

                Person newPassenger = new Person("location of station", passName.getText(), passDestination.getText());


                Bus bus = caller.station.findbyLocation(passDestination.getText());
                if (bus == null) {
                    JDialog d = new JDialog();
                    d.setContentPane(new JLabel("Addition failed"));
                    d.setVisible(true);
                    d.pack();
                    d.requestFocus();

                } else {
                    bus.addPassenger(newPassenger);
                    JDialog d = new JDialog();
                    d.setContentPane(new JLabel("Addition successful"));
                    d.setVisible(true);
                    d.pack();
                    d.requestFocus();

                }
                dispose();
            }
        });


        /**
         * A click listener on CANCEL button on the interface
         * This closes the window and displays the previous one when clicked
         */
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        add(addPassengerPanel);
        pack();
        setVisible(true);
    }





    @Override
    public void dispose() {
        caller.setVisible(true);
        super.dispose();
    }
}
