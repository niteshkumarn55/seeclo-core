package com.lowes;

import java.util.Arrays;
import java.util.List;


public class Lowes {

    public static void main(String[] args) {
//        String s = "NITESH";
        Lowes lowes = new Lowes();
//        System.out.println(lowes.lengthOf(s.toCharArray()));
        Integer[] i = {1, 3, 5, 2, 1, 9, 4, 4, 4, 9};
        lowes.maxNdMin(Arrays.asList(i));
    }

    public int lengthOf(char[] c){
        int lenght = 0;
        for(char a : c){
            lenght++;
        }
        return lenght;
    }

   public void maxNdMin(List<Integer> numbers){
        Integer max = null;
        Integer min = null;
        for (Integer number : numbers){
            if(max == null && min == null){
                max = number;
                min = number;
            }else if(number >= max){
                max = number;
            }else if(number <= min){
                min = number;
            }
        }

       System.out.println("The max number is :: "+max);
       System.out.println("The min number is :: "+min);
   }


}
