package com.duala.UI;


import com.duala.Objects.Bus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ViewBuses extends JFrame{
    private JPanel panel1;
    private JTabbedPane BusList;
    private JButton close;
    private JButton addBus;
    private JButton removeBus;
    private JList busList;
    private JLabel lab = new JLabel("someting");
    private StationTerminalUI caller;

    public ViewBuses(StationTerminalUI caller){
        busList.setListData(caller.station.getAllAsList());
        add(panel1);
        this.caller = caller;

        pack();
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
                //TODO figure out how to remove vehicle from listview
//                busList.setListData();
//                busList.repaint();
            }
        });
    }


    @Override
    public void dispose() {
        super.dispose();
        caller.setVisible(true);
    }


}
