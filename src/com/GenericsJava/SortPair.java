package com.GenericsJava;


import java.util.Objects;

/*
Type Bound
 */
public class SortPair <T extends  Object & Comparable<T>> {

    private final T first;
    private final T second;


    public SortPair(T o1, T o2) {
        if(o1.compareTo(o2)<0) {
            this.first = o1;
            this.second = o2;
        }else{
            this.first = o2;
            this.second = o1;
        }
    }
    /*
    Generics on methods
     */
    public <T extends Object> T getFirst(){
        return (T)this.first;
    }

    public <T extends Object> T getSecond(){
        return (T) this.second;
    }
}

class SortPairValue {

    public static void main(String[] args) {
        SortPair<Integer> sortPair = new SortPair<>(2, 4);
        System.out.println((Integer) sortPair.getFirst());
        System.out.println((Integer) sortPair.getSecond());
    }

}



