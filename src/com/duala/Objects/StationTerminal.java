package com.duala.Objects;

import java.util.Objects;

/**
 * This class models the trotro station
 * Building a digital abstraction that allows the station master to efficiently manage the buses in the stations
 */
public class StationTerminal {
    private Node head = new Node();
    private Node tail = new Node();
    private int size = 0;

    public StationTerminal(){
        this.head.next = tail;
        this.tail.previous = head;
    }



    /**
     * Returns the number of nodes in the doubly linked list.
     * @return E
     */
    public int getSize() {

        return size;
    }

//    public int countVacantBuses(Node node) {
//
//        //base case
//        if (node.next == null){
//            if (!node.data.isFull()){//if bus is not full increase count by one
//                return 1;
//            }
//    }
//        return countVacantBuses(node.next);
////
////        if (!node.data.isFull()) //if a bus is not full increase count by one
////        {
////            countVacantBuses(node.next);
////            return 1;
////        }
//    }
    public int countVacantBuses(Node node) {

   int count = 0;
   while (node.next != null){
       if (!node.data.isFull())
           count +=1;

       node = node.next;
        }

   return count;
    }


    /**
     * Adds a node to the top of the list
     * @param data element to be contained in the first node of the list
     * @return Node if addition was successful
     */
    public Node addFirst(Bus data){
        Node node = new Node(data);
        node.next = head.next;
        head.next = node;
        node.previous = head;
        node.next.previous = node;

        size++;
        return node;
    }


    /**
     * Removes and returns the node at the head of the list
     * @return Element at the first index of the list, null if the list is empty
     */
    public Node removeFirst(){

        //Return null if the list is empyt
        if (isEmpty())
            return  null;
        Node first = this.head.next;

        //Connecting head to second element
        this.head.next = this.head.next.next;  //second element
        this.head.next.previous = this.head;

        //disconnecting first element's links
        first = null;
        first = null;
        size--;

        return first;
    }


    /**
     * Removes and returns the node at the end of the list
     * @return Element at the end of the list, null if the list is empty
     */
    public Node removelast(){

        //If the list is empty return null
        if(isEmpty())
            return null;

        Node last = this.tail.previous;

        //Connecting head to second element
        this.tail.previous = this.tail.previous.previous;  //second element
        this.tail.previous.next = this.tail;

        //disconnecting first element's links
        last.next = null;
        last.previous = null;
        size--;

        return last;
    }


    /**
     * Adds an Node to the end of the list
     * @param data element to be added to be list
     * @return node containing the element if the addition was successful
     */
    public Node addLast(Bus data){
        Node last = new Node(this.tail.previous,data, this.tail); //Connecting new node to list

        //positioning node between tail and former last node
        this.tail.previous.next = last;
        this.tail.previous = last;

        size++;
        return last;
    }


    /**
     * Inserts an element at the specified index
     * @param data Data to be inserted
     * @param index Index at which data should be inserted
     * @return Node containing data if insertion was successful
     */
    public Node insertAt(Bus data, int index){
        //TODO throw exception for negative indexes

        Node node = new Node(data);
        Node before = this.head; //Node to appear before the new node
        Node after; //Node to appear after new node


        for (int i = 0; i < index-1; i++)
            before = before.next;
        after = before.next;

        before.next = node;
        node.previous = before;

        after.previous = node;
        node.next = after;

        return node;
    }


    /**Finds and returns the first one that contains the specified data
     * @param data Data to be found in node
     * @return Node containing specified data; null if none exists
     */
    public Node find(Bus data){
        Node node = null;

        //if list is
        if (isEmpty())
            return node;

        Node current = this.head.next;

        for (int index = 0; index < getSize(); index++) {
            if (current.data == data)
                break;
            current = current.next;

        }



        return  node;
    }


    /**
     * Removes the first occurring node that contains the specified data
     * @param data Data to be removed from the list
     * @return Removed node that contained the entered data. null if none exists
     */
    public Node remove(Bus data){
        Node node = find(data);

        if (node == null)
            return null;

        node.next.previous = node.previous;
        node.previous.next = node.next;
        node.previous = null;
        node.next = null;


        return node;
    }


    /**
     * Returns a boolean to show if the list is empty
     * @return true if list is empty. false if list is not empty
     */
    public boolean isEmpty(){
        return 0 == getSize();
    }

    /**
     * Returns the first vehicle in the list
     * @return
     */
    public Node getFirst() {
        return this.head.next;
    }


    static  class Node{
        private Bus data;
        private Node next;
        private Node previous;

        Node(){

        }


        Node (Bus data){
            this.data = data;
        }

        Node(Node previous, Bus data, Node next){
            this.previous = previous;
            this.data = data;
            this.next = next;
        }



        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return Objects.equals(data, node.data) &&
                    Objects.equals(next, node.next) &&
                    Objects.equals(previous, node.previous);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }
    }
}
