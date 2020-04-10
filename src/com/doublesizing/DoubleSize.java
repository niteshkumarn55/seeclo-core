package com.doublesizing;

import java.util.*;

public class DoubleSize {


    public static long doubleSize(List<Long> arr, long b) {

        System.out.println(arr);
        Collections.sort(arr);
        for(Long num : arr){
            if(b==num){
                b=b+num;
            }
        }
        System.out.println(b);
        return b;
    }

    public static void main(String[] args) {
        List<Long> a = new ArrayList<>();
        Long aa[] = {2L,5l,4l,6l,8l};

        doubleSize(Arrays.asList(aa), 2);

    }

}
