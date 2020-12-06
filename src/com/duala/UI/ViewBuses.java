package com.duala.UI;


import javax.swing.*;

public class ViewBuses extends JFrame{
    private JPanel panel1;
    private JTabbedPane BusList;
    private JScrollPane busList;
    private JLabel lab = new JLabel("someting");

    public ViewBuses(){
    for (int i = 0; i > 50; i++)
        busList.add(lab,i); //TODO make this show

    add(panel1);

    pack();
    setVisible(true);

    }

}
