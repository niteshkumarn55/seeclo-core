package com.seeclo.BasicDataStructures;

public class LoopSee {

    public static void main(String[] args){
        Long s = System.nanoTime();
        for(int i=1;i<=10;i++){
            System.out.println(i+" "+(System.nanoTime()-s));
        }
    }
}
