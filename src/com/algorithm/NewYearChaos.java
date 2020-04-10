package com.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NewYearChaos {
    void calc(int[] q)
    {
        int ans = 0;
        for (int i = q.length - 1; i >= 0; i--) {
            if (q[i] - (i + 1) > 2) {
                System.out.println("TOO CHAOTIC...");
                return;
            }
            for (int j = Math.max(0, q[i] - 2); j < i; j++) {
                if (q[j] > q[i]) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        NewYearChaos newYearChaos =  new NewYearChaos();
        int[] i = {1, 2, 5, 3, 4, 7, 8, 6};
        newYearChaos.calc(i);
        System.out.println("apple".compareTo("bannana"));
        String a = "strawberries";
        System.out.println(a.substring(2,5));
        List l = new ArrayList();
        l.add("s");
        l.add(1);
        System.out.println(l.get(0)instanceof Object);
        System.out.println(l.get(1)instanceof Integer);
        try {
            System.out.println(p(1));
        }catch (Exception e){
            System.out.println("a");
        }finally {
            System.out.println("x");
        }


    }

    static Exception p(int i){
        if(i>0){
            throw new Error();
        }else{
            throw  new RuntimeException();
        }
    }
}
