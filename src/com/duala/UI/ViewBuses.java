package com.duala.UI;


import com.duala.Objects.Bus;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewBuses extends JFrame{
    private JPanel panel1;
    private JTabbedPane BusList;
    private JButton close;
    private JButton addBus;
    private JButton removeBus;
    private JList busList;
    private JLabel lab = new JLabel("someting");
    private JFrame caller;

    public ViewBuses(JFrame caller){

        Bus bus = new Bus("GH456", "Nima","Kofi Mansa");
        String[] test = {bus.toString(),bus.toString(),bus.toString()};
        busList.setListData(test);
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
