package com.algorithm;

public class ReveseString {

    public static void main(String[] args) {
        String s1 = "This is Bangalore city";
        char[] c = s1.toCharArray();

        for (int i = c.length-1; i>0; i--){
        int count = 0;
            char[] revc = new char[c.length-1];
            count++;
            if(c[i]!=' ') {
                revc[c.length-1 - i] = c[i];
            }else{
                for(int j = revc.length-1; j>0; j--){
                    System.out.print(j);
                }
            }


        }
    }
}
