package com.duala.Objects;
//History of additions and removals modeled with a stack
public class History {
    public Node top;
    public int size;

    History(){
        top = new Node(null,"");
    }

    public String[] getAllAsList() {
        //TODO return all values as list
        String[] list = new String[size];
        for (int i = 0; i < size; i++) {
//            list[i] = next node
        }
        return new String[size];
    }


    class Node{
        public Node previous;
        public String entry;

        Node(Node prev, String entry){
            this.previous = prev;
            this.entry = entry;
        }
    }


    public void  push(String data){
        //TODO add data to stack
    }
}
