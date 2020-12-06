package com.duala.UI;

import com.duala.Objects.Person;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPassenger extends JFrame {

    private JButton bookSeatButton;
    private JTextField passName;
    private JTextField passDestination;
    private JComboBox availableBuses;
    private JTextField passFare;
    private JPanel addPassengerPanel;
    private JLabel txt1;
    private JLabel txt2;
    private JLabel txt3;
    private JLabel txt4;
    private JButton cancel;


    private JFrame caller;


    public AddPassenger(JFrame caller){
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
                //TODO add person to main class list
                dispose();
            }
        });
        init();
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }


    /**
     * Initialises the panel and attaches the components to the frame
     */
    public void init(){

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
