package com.datastructures.stack;


import java.util.Objects;

public class StackGeneric<T> {

    private final T[] arr;
    private int capacity;
    private int top = -1;

    public StackGeneric(int capacity) {
        this.capacity = capacity;
        this.arr = (T[])new Object[capacity];

    }


    public boolean isEmpty(){
        return this.top == -1 ? true : false;
    }

    public boolean isFull(){
        return  this.top == this.capacity - 1 ? true : false;
    }

    public T peek(){
        return !isEmpty() ? this.arr[this.top] : null;
    }

    public int getIndex(T element){
        if(!isEmpty()){
            for (int i = 0 ; i < this.capacity ; i++){
                if (element.equals(this.arr[i])){
                    return i;
                }
            }
        }
        return -1;
    }

    public <T> T get(int index){
        if(!isEmpty() && index <= this.top){
            return (T) arr[index];
        }else{
            return null;
        }
    }

    public void push(T element) throws Exception {
        if(!isFull()){
            this.arr[++this.top] = element;
        }else{
            throw new Exception("Stack size full");
        }
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }else{
            return this.arr[this.top--];
        }
    }

    public int totalSize(){
        return this.capacity;
    }

    public int size(){
        return this.top+1;
    }

    public void popAll(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }else{
            while (this.top!=-1){
                System.out.println(this.arr[this.top--]);
            }
        }
    }

}
