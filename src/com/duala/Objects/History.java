package com.duala.Objects;


//History of additions and removals modeled with a stack
public class History {
    public Node top;
    public int size;

    public History(){
        top = new Node(null,"");
    }

    public String[] getAllAsList() {

        String[] list = new String[size];
        Node node = top;
        for (int i = 0; i < size; i++) {
            list[i] = node.entry;
            node = node.previous;

        }
        return list;
    }

    public Node pop(){
        Node first = top;
        top = top.previous;
        return first;
    }


    public Node push(String entry){
        Node node = new Node(top, entry);
        top = node;
        size++;
        return node;
    }


    class Node{
        public Node previous;
        public String entry;

        Node(Node prev, String entry){
            this.previous = prev;
            this.entry = entry;
        }
    }

}
