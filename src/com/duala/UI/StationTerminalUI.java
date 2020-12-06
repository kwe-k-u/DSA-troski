package com.duala.UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StationTerminalUI extends JFrame {
    private JButton addPassengerButton;
    private JButton aboutButton;
    private JButton viewStationDataButton;
    private JButton closeApplicationButton;
    private JPanel DesktopUI;





    private JFrame parent = this;
//    private ImageIcon image = new ImageIcon("logo.png");


    public StationTerminalUI(){

        setContentPane(DesktopUI);
        pack();
        setTitle("Troski System");
//        setIconImage(image); //Program logo
        setResizable(false);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Clicking on close exists the application

        /**
         * Closes the application
         */
        closeApplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });


        /**
         * Displays a window to allow for passengers to be added to buses
         */
        addPassengerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                new AddPassenger(parent);
            }
        });



        viewStationDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewBuses n = new ViewBuses(parent);
                setVisible(false);




            }
        });

        /**
         * Displays window showing project details
         */
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                parent.setVisible(false);
                new About(parent);
            }
        });
    }

}
