package com.duala;

//arraybased circularly linked list
public class Bus {
    private final int CAPACITY = 30;
    private final Seat[] layout = new Seat[this.CAPACITY]; //The bus has 30 seats(exclusive of driver)
    private int size;
    private int firstIndex;


    private int findEmpty(){
        return (this.firstIndex + size) % CAPACITY;
    }

    /**
     * Adds a passenger to the next available seat in the bus
     *
     * @throws StackOverflowError if the bus is full and another passenger is added
     * @param passenger new passenger
     * @return Seat object if the addition was successful. null if it failed
     */
    public Seat addPassenger(Person passenger){


        //TODO throw stackoverflow error if full. catch error and display message to screen but continue code
//        if (isFull()) throw StackOverflowError()

        int empty = findEmpty();
        Seat newSeat = new Seat(passenger);
        layout[empty] = newSeat;
        size++;

        return newSeat;
    }

    /**
     * Checks the Seat of the first passenger in the bus without removal
     * @return first seat of bus. null if bus is empty
     */
    public Seat peekFist(){

        return this.layout[firstIndex];
    }


    /**
     * Removes and returns the first occupied seat
     * @return Seat of the first person
     */
    public Seat removeFirst(){
        //TODO throw exception if bus is empty
        Seat first = layout[firstIndex];
        layout[firstIndex] = null;
        //Reset first index to zero if only one person is in vehicle
        if (size <2){
            firstIndex = 0;
        } else{
            firstIndex = (firstIndex+1) % CAPACITY;
        }
        size--;

        return first;
    }

    /**
     * Checks the number of people seated in the bus
     * @return number of passengers in the bus
     */
    public  int getPassengerCount(){
        return this.size;
    }

    /**
     * Gives a boolean to check if the bus is full
     * @return true if full. false if not
     */
    public boolean isFull(){
        return this.size == this.CAPACITY;
    }



    /**
     * Gives a boolean to check if the bus is empty
     * @return true if empty. false if not
     */
    public boolean isEmpty(){
        return this.size == 0;
    }



    private class Seat{
        private Person occupant; //Person occupying the seat

        public Seat(Person person){
            this.occupant = person;
        }

        /**
         * Returns the object of the person currently occupying the seat
         * @return person seated
         */
        public Person getOccupant() {
            return occupant;
        }
    }
}
