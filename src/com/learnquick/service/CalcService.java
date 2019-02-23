package com.learnquick.service;

import com.learnquick.calculator.Calc;

public class CalcService {

    public static void main(String[] args){
        int a = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        Calc calc = new Calc();
       int e = calc.add(a,b,c,d);
        System.out.println("The value added for learn quick client is -> "+e);
    }
}
