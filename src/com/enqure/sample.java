package com.enqure;

import com.sample.Sample;

public class sample {
   {
       System.out.println("si");
   }

   static {
       System.out.println("ss");
   }

    public sample() {
        System.out.println("sc");
    }

    public static void main(String[] args) {
        Sample sq = new Sample();
        Sample sw = new Sample();
    }
}

 class a extends sample{
     public a() {
         System.out.println("a");
     }

 }
