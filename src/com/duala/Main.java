package com.duala;

import com.duala.Objects.Bus;
import com.duala.Objects.Person;
import com.duala.Objects.StationTerminal;
import com.duala.UI.StationTerminalUI;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        StationTerminalUI window = new StationTerminalUI(new StationTerminal());



        //Default buses and passengers
        Person kofi = new Person("37", "Kofi", "Nima");
        Person ama = new Person("37", "Ama", "Accra");
        Person akosua = new Person("37", "Akosua", "Labadi");
        Person esi = new Person("37", "Esi", "Tema");

        Bus tema = new Bus("GH456", "Tema","Kweku Mansa");
        Bus nima = new Bus("GH456D", "Nima","Pokuaa Yeboah");
        Bus kaneshie = new Bus("GH456B", "Kaneshie","Nana Anasah");
        Bus newTown = new Bus("GH456C", "Nima","Issaka Amadu");
        Bus accra = new Bus("GH416", "Accra","Kwame Kotoku");

        //giving some buses passengers
        tema.addPassenger(kofi);
        tema.addPassenger(ama);
        kaneshie.addPassenger(kofi);
        tema.addPassenger(kofi);
        accra.addPassenger(esi);
        newTown.addPassenger(akosua);
        accra.addPassenger(akosua);
        nima.addPassenger(akosua);
        newTown.addPassenger(akosua);




        window.station.addFirst(tema);
        window.station.addFirst(nima);
        window.station.addFirst(kaneshie);
        window.station.addFirst(newTown);
        window.station.addFirst(accra);



    }





}
