package com.duala;

import com.duala.Objects.Bus;
import com.duala.Objects.Person;
import com.duala.Objects.StationTerminal;
import com.duala.UI.AddPassenger;
import com.duala.UI.StationTerminalUI;
import com.duala.UI.ViewBuses;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //TODO find function to generate random buses
        //TODO function to generate random people

//        StationTerminal stationTerminal = new StationTerminal();
//        JFrame window = new StationTerminalUI();



        //TESTING structure
        Person fake = new Person("Accra", "Kofi", "Nima");
        Bus full = new Bus();
        Bus bus = new Bus();

        StationTerminal station = new StationTerminal();

        //Filling bus instance
        for (int i = 0; i< 30; i++){
            full.addPassenger(fake);
        }

        //Adding one person to random bus
        bus.addPassenger(fake);

        //Adding 5 buses to station; 3 full buses and 2 vacant ones
        station.addFirst(full);
        station.addFirst(full);
        station.addFirst(bus);
        station.addFirst(full);
        station.addFirst(bus);

        System.out.println(station.countVacantBuses(station.getFirst()));
        System.out.println(bus.isFull());
        System.out.println(full.isFull());

    }





}
