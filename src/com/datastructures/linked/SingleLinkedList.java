package com.datastructures.linked;

public class SingleLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    private class Node<T>{
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
        }

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    /*
        push the node to the head
     */
    public void push(T data){
        Node node = new Node(data, this.head);
        if(head == null){
            this.head = node;
            this.tail = node;
        }else{
            this.head = node;
        }
        size++;
    }

    public void append(T data){
        Node node = new Node(data);
        if(head == null){
            this.head = node;
            this.tail = node;
        }else{
            this.tail.next = node;
            this.tail = node;
        }
        size++;
    }
//    Remove private head and tail and node class if you uncomment this method
/*
    public void insertAfter(T data, Node previousNode) throws Exception{
        if(previousNode!=null) {
            Node node = new Node(data, previousNode.next);
            previousNode.next = node;
        }else{
            throw new Exception("Previous node is null");
        }
    }*/

    public void pop(){
        if(head == null){
            System.out.println("No Elements to POP. LinkedList is Empty");
        }else{
            this.head = this.head.next;
            if(this.head == null){
                this.tail = this.head;
            }
            size --;
        }
    }

    public void deleteNode(T data){
        Node current = this.head;
        Node previousNode = null;
        boolean flag = false;
        if(head == null){
            System.out.println("No Elements to POP. LinkedList is Empty");
        }else{
            while (current!=null){
                if(current.data.equals(data)) {
                    if (current.next == null && previousNode == null) {
                        this.tail = null;
                        this.head = null;
                    } else {
                        previousNode.next = current.next;
                        if (previousNode.next == null) {
                            this.tail = previousNode;
                        }
                    }
                    size--;
                    flag=true;
                    break;
                }
                previousNode = current;
                current = current.next;
            }
            if(flag){
                System.out.println("No Match Found!!!");
            }
        }
    }

    public void display(){
        Node current = this.head;
        if(head==null){
            System.out.println("Empty LinkedList");
        }else{
            while (current!=null){
                System.out.println(current.data);
                current = current.next;
            }
        }
    }

    public int size(){
        return this.size;
    }

}

