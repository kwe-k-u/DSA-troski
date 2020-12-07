package com.duala;

import com.duala.Objects.Bus;
import com.duala.Objects.Person;
import com.duala.Objects.StationTerminal;
import com.duala.UI.StationTerminalUI;


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
        window.history.push("Passenger added: " + kofi.toString());
        tema.addPassenger(ama);
        window.history.push("Passenger added: " + ama.toString());
        kaneshie.addPassenger(kofi);
        window.history.push("Passenger added: " + kofi.toString());
        tema.addPassenger(kofi);
        window.history.push("Passenger added: " + kofi.toString());
        accra.addPassenger(esi);
        window.history.push("Passenger added: " + esi.toString());
        newTown.addPassenger(akosua);
        window.history.push("Passenger added: " + akosua.toString());
        accra.addPassenger(akosua);
        window.history.push("Passenger added: " + akosua.toString());
        nima.addPassenger(akosua);
        window.history.push("Passenger added: " + akosua.toString());
        newTown.addPassenger(akosua);
        window.history.push("Passenger added: " + akosua.toString());




        window.station.addFirst(tema);
        window.history.push("Bus added: " + tema.toString());
        window.station.addFirst(nima);
        window.history.push("Bus added: " + nima.toString());
        window.station.addFirst(kaneshie);
        window.history.push("Bus added: " + kaneshie.toString());
        window.station.addFirst(newTown);
        window.history.push("Bus added: " + newTown.toString());
        window.station.addFirst(accra);
        window.history.push("Bus added: " + accra.toString());



    }





}
