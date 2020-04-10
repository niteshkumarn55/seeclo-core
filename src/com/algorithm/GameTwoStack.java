package com.algorithm;

import java.util.*;

public class GameTwoStack {

    static int twoStacks(int x, int[] a, int[] b) {

        int amax = a.length -1;
        int bmax = b.length -1;
        int atop = 0;
        int btop = 0;
        int sum = 0;
        int count = 0;
        while(sum <= x){
            if(atop!=amax){
                if(a[atop] <= b[btop]){
                    sum += a[atop];
                    ++atop;

                }else if(btop!=bmax){
                    sum += b[btop];
                    ++btop;

                }
            }else if(btop!=bmax){
                sum += b[btop];
                ++btop;
            }
            if(sum <= x) {
                count++;
            }else{
                break;
            }
        }

        return count;
    }

    static int twoStacks2(int x, int[] a, int[] b) {
        int amax = a.length -1;
        int bmax = b.length -1;
        int atop = 0;
        int btop = 0;
        int sum = 0;
        int count = 0;
        while(sum <= x ){
            if(a[atop] <= b[btop]){
                sum += a[atop];
                ++atop;

            }else{
                sum += b[btop];
                ++btop;
            }
            if(sum <= x) {
                count++;
            }
        }

        return count;

    }

    public static void main(String[] args) {
  /*      int[] a = {7, 15, 12, 0, 5, 18, 17, 2, 10, 15, 4, 2, 9, 15, 13, 12, 16};
        int[] b = {12, 16, 6, 8, 16, 15, 18, 3, 11, 0, 17, 7, 6, 11, 14, 13, 15, 6, 18, 6, 16, 12, 16, 11, 16, 11, 31, 34, 5};
        int x = 62;



        System.out.println(twoStacks2(x, a, b));*/

        Scanner in = new Scanner(System.in);
        int numberOfDays = in.nextInt();
        int numberOfIngredients = in.nextInt();
        List<String> newIngre = new ArrayList<>();
        Set<String> removedIngre = new HashSet<>();
        Map<String, Integer> categoryQuota = new HashMap<>();
        categoryQuota.put("FAT",0);
        categoryQuota.put("FIBRE", 0);
        categoryQuota.put("CARB", 0);
        int minIngredentDish = (60/100) * numberOfIngredients;
        boolean flag = false;
        for (int i = 0; i < numberOfDays; i++) {
            String maxQuotaCate = null;
            String ingredientId = in.next();
            if(ingredientId.startsWith("FAT")){
                int val = categoryQuota.get("FAT").intValue() +1;
                categoryQuota.put("FAT",val);
                if(val>= minIngredentDish){
                    flag = true;
                    maxQuotaCate = "FAT";
                }
            }else if(ingredientId.startsWith("FIBRE")){
                int val = categoryQuota.get("FIBRE").intValue() + 1;
                categoryQuota.put("FIBRE", val);
                if(val>= minIngredentDish){
                    flag = true;
                    maxQuotaCate = "FIBRE";
                }
            }else if(ingredientId.startsWith("CARB")){
                int val = categoryQuota.get("CARB").intValue() + 1;
                categoryQuota.put("CARB", val);
                if(val>= minIngredentDish){
                    flag = true;
                    maxQuotaCate = "CARB";
                }
            }
            newIngre.add(ingredientId);
            if(removedIngre.size()>0){
                newIngre.removeAll(removedIngre);
            }
            if(flag){
                for(String k : newIngre){
                    if(k.startsWith("FAT")){

                    }else if(k.startsWith("FIBRE")){

                    }else if(k.startsWith("CARBS")){

                    }
                }
//                String dish = String.join(":", t);
//                System.out.print(dish);
                removedIngre.addAll(newIngre);
                newIngre.removeAll(removedIngre);
            }else{
                System.out.print("-");
            }
        }
    }
}
