package com.duala.UI;

import com.duala.Objects.History;
import com.duala.Objects.StationTerminal;

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

    private StationTerminalUI parent = this;
    public StationTerminal station;
    public History history;



    public StationTerminalUI(StationTerminal stat){

        this.station = stat;
        setContentPane(DesktopUI);
        pack();
        setTitle("Troski System");
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


        /**
         * Displays window showing information on available buses
         */
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
