package com.duala.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class StationTerminalUI extends JFrame {


    private JButton addPassengerButton;
    private JButton aboutButton;
    private JButton viewStationDataButton;
    private JButton closeApplicationButton;
    private JPanel DesktopUI;
//    private ImageIcon image = new ImageIcon(Logo.png)

    public StationTerminalUI(){

        setContentPane(DesktopUI);
        setSize(400,600);
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
                new AddPassenger();
            }
        });


        /**
         * Waits for other windows to close before making the frame visible
         */
        //TODO figure implementation
        DesktopUI.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });


        viewStationDataButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ViewBuses n = new ViewBuses();
                setVisible(false);




            }
        });
        aboutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new About();
            }
        });
    }

}
