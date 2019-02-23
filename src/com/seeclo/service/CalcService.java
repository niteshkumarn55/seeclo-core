package com.seeclo.service;

import com.seeclo.calculator.Calc;

public class CalcService {

    public static void main(String[] args){
        int a  = 30;
        int b= 10;
        int c = 40;
        Calc calc  = new Calc();
        int  d = calc.add(a,b,c);
        System.out.println("The added value is -> "+d);
    }

}
