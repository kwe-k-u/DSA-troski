package com.duala.Objects;

/**
 *
 */


public class BusStation{
    private String location;
    private Bus[] buses;
    private int seats = 15;
//method to find empty buses
//method to assign people to buses
//method to remove people from buses


    // Method to find empty buses
    public boolean isEmpty(){
        if (buses.length == null){
            return true;
        }
        return false;
    }


// if(bus.length == 0)
//    System.out.println("The bus is empty");
// else
//    System.out.println("The bus is full");
//


    String[] chars = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"};

    //A method to set up the seats (so you can see it in a seperate block):
    public void assignSeats() {
        for (int i =0; i<seats.length; i++) {
            for (int j = 0; j<seats[i].length; j++) {
                String s = chars[i] + (j+1) + "";
                seats[i][j] =s;

            }

        }
        System.out.println("b1, b2, c3 ....................o15");
        System.out.println("Enter a seat code you want");



    }


    // remove method
    public void remove(){
        if(Person <= 0) throw  new IlegalStateException();
        try{
            Person.this.remove(Person);
        }
        catch(IndexOutOfBoundsException ex){
        }

    }

}

