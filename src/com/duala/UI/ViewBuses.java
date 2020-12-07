package com.duala.UI;


import com.duala.Objects.Bus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewBuses extends JFrame{
    private JPanel panel1;
    private JButton close;
    private JButton addBus;
    private JButton removeBus;
    private JTabbedPane tabbedPane;
    private JList busList;
    private JList historyList;
    private StationTerminalUI caller;

    private JFrame parent = this;

    public ViewBuses(StationTerminalUI caller){
        busList.setListData(caller.station.getAllAsList());

        historyList.setListData(caller.history.getAllAsList());

//        String[] test = {"some dude", "other dude", "last dude"};
//
//        historyList.setListData(test);




        setSize(600,700);
        add(panel1);
        this.caller = caller;

//        pack();
        setVisible(true);

        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                dispose();
            }
        });


        removeBus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //TODO let bus addition and removal update on list dynamically
                new RemoveBus(caller);

            }
        });
        addBus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                new AddBus(caller);
            }
        });
    }


    @Override
    public void dispose() {
        super.dispose();
        caller.setVisible(true);
    }


}
