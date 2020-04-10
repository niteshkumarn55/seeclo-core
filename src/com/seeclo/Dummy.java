package com.seeclo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Dummy {

    public static void main(String[] args) {
    Dummy dummy = new Dummy();
    dummy.generateLexicoString(3, 25);
    int unique = dummy.countOfSubString("aaggtbklod sS");
        System.out.println(unique);
    }

    public int countOfSubString(String a){
        Set resultSet = new HashSet();
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
            resultSet.add(new Character(a.charAt(i)));
        }
        return resultSet.size();

    }

    public String generateLexicoString(int n, int k){
        char[] a = new char[n];
        // Initially fill the array with character 'a'
        for(int i=0;i<n;i++){
            a[i] = 'a';
        }
        int a_count = n;
        int tot_count = k;
        int x = tot_count - a_count;
        for(int i=n-1;i>=0; i--){
            if(x> 26){
                a[i] = 'z';
                x = (x-26)+1;
            }
            else if(x == 26){
                a[i] = (char) (a[i] + 25);
                x = x - 25;
            }
            else if(x > 0){
                a[i] = (char) (a[i] + x);
                x = 0;
            }
            if(x == 0)
                break;
        }
        String op= String.valueOf(a);
        System.out.println(op);
         return op;
    }
}
