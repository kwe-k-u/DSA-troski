package com.duala.Objects;

import java.util.Objects;

public class Person {
    private String name;
    private String pickup;
    private String destination;
    private double fare;
    private Bus assignedBus;

    //Constructor
    public Person(String pickup, String name, String destination){
        this.destination = destination;
        this.name = name;
        this.pickup = pickup;
    }


    /**
     * Gives the location of the bus stop at which the person is to be picked up
     * @return the location at which the person is to be picked up
     */
    public String getPickup() {
        return pickup;
    }

    /**
     * Gives the location of the bus stop at which the person is to alight
     * @return the location at which the person is to alight
     */
    public String getDestination() {
        return destination;
    }


    /**
     * Gives the name of the passenger
     * @return name of person
     */
    public String getName() {
        return name;
    }


    /**
     * Sets the new pick up location for the passenger
     * @param pickup new location at which the person is to be picked up
     */
    public void setPickup(String pickup) {
        this.pickup = pickup;
    }


    /**
     * Sets a new name for the passenger
     * @param name new name for the passenger
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * This assigns a passenger to a bus with vacancy
     * @param bus bus to which the passenger is assigned
     * @throws IllegalStateException if the passenger is already assigned a bus
     */
    public void assignBus(Bus bus){
        //If the passenger is not assigned a bus, give them one
        if (this.getAssignedBus() == null) {
            this.assignedBus = bus;
            bus.addPassenger(this);
        } else {//If the passenger already has a bus, reassign them a new bus.
            throw new IllegalStateException();
        }
    }


    /**
     * Gets the passengers assigned bus
     * @return Passenger's assigned bus
     */
    public Bus getAssignedBus(){
        return this.assignedBus;
    }





    /**
     * Sets the new dropoff location for the passenger
     * @param location new location at which the person is to alight
     */
    public void setDestination(String location){
        this.destination = location;
    }


    /**
     * Compares the current object with another to determine if both are the same object
     * @param o Object to be compared with
     * @return true if the objects are same. false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return this.getName() == person.getName() &&
                this.getDestination() == person.getDestination() &&
                this.getPickup() == person.getName();
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pickup='" + pickup + '\'' +
                ", destination='" + destination + '\'' +
                ", fare=" + fare +
                ", assignedBus=" + assignedBus +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pickup, destination);
    }
}
