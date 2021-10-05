package com.algorithm;

import com.sun.deploy.util.StringUtils;

public class IntergerToString {


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println("The  output "+intToString(arr,"|"));
    }


    public static String intToString(int[] arr, String delimi){
        String concatInt = null;
        for(int elm : arr){
            if(concatInt!=null){
                concatInt += delimi + elm;
            }else{
                concatInt = elm+"";
            }
        }
        return concatInt;
    }


}
