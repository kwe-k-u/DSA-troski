package com.duala.UI;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewBuses extends JFrame{
    private JPanel panel1;
    private JTabbedPane BusList;
    private JScrollPane busList;
    private JButton close;
    private JLabel lab = new JLabel("someting");
    private JFrame caller;

    public ViewBuses(JFrame caller){
    for (int i = 0; i > 50; i++)
        busList.add(lab,i); //TODO make this show

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
    }


    @Override
    public void dispose() {
        super.dispose();
        caller.setVisible(true);
    }


}
