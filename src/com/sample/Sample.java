package com.sample;

public class Sample {

    static int[] reverseArray(int[] a){
        int[] b = new int[a.length];
        for (int i=a.length-1,j= 0 ; i>=0; i--,j++){
            b[j]= a[i];
        }
        return b;
    }


    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = reverseArray(a);
    for(int i=0; i<=b.length-1; i++){
        System.out.print(b[i]);
    }

    }
}
