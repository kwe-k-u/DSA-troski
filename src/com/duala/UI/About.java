package com.duala.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame{
    private JPanel panel1;
    private JTextArea text;
    private JButton Close;

    private JFrame caller;

    String aboutMsg = "This application was created by Kweku Appiah Acquaye, Richida Pokuaa Gyimah and Prince Yeboah as \npart of " +
            "their data structures final project at Ashesi University during the fall semester, 2020. The application \nserves as a prototype" +
            " for a transportation system that allows bus station masters in Ghana to efficiently assign passengers to \nbuses" +
            "(popularly referred to as trotros). this aims to avoid situations where people may have to queue for hours \nonly " +
            "to realise that there are no more vacancies in buses.";


    About(JFrame caller){
        text.setText(aboutMsg);
        add(panel1);
        setVisible(true);
        this.caller = caller;
        pack();
        Close.addActionListener(new ActionListener() {
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
