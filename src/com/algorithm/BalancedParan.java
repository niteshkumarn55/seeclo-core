package com.algorithm;

import java.util.HashMap;
import java.util.Map;

public class BalancedParan {

    static class stack {
        int top = -1;
        char[] items = new char[100];

        void push(char x) {
            if (top == 99) {
                System.out.println("Stack full");
            } else {
                items[++top] = x;
            }
        }

        char pop() {
            if (top == -1) {
                System.out.println("Under stack");
                return '\0';
            } else {
                char element = items[top];
                top--;
                return element;
            }

        }

        boolean isEmpty() {
            return (top == -1) ? true : false;
        }


    }

    static char mappedBrakets(char ele){
        char e;
        switch (ele){
            case '(':
                e = ')';
            case ')':
                e = ')';
                break;
            case '{':
                e = '}';
            case '}':
                e = '{';
            case '[':
                e = ']';
            case ']':
                e = '[';
            default:
                throw new IllegalStateException("Unexpected value: " + ele);
        }
        return e;
    }


    static boolean isMatchingPair(char element1, char element2) {
        if (element1 == '(' && element2 == ')') {
            return true;
        } else if (element1 == '{' && element2 == '}') {
            return true;
        } else if (element1 == '[' && element2 == ']') {
            return true;
        } else {
            return false;
        }
    }

    static boolean areParenthesisBalance(char[] expr) {
        stack st = new stack();
        for (int i = 0; i < expr.length; i++) {
            if (expr[i] == '{' || expr[i] == '[' || expr[i] == '(') {
                st.push(expr[i]);
            }
            if (expr[i] == '}' || expr[i] == ']' || expr[i] == ')') {
                if (st.isEmpty()) {
                    return false;
                } else if (!isMatchingPair(st.pop(), expr[i])) {
                    return false;
                }
            }

        }
        if(st.isEmpty()){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        String a = "{}{}{}[([]{}{})]{}()()[[[]][()[]]]()[][]{}({}{()}([]{})()){[]}(([([]{{}({{[[()[][]]]}({[][()]{}}{}(){}){}([])}{()()})})]{()([])}[]))([{}()()])([]){}[{()()}][{}[[]()]({{([{}{}[]{()}[]])[(){([])}()][]}}){}()[]][[()]]([](()[][]){(({})[]{}){}}{{{}}})[()]{{((())){()[](){(({{}{}()[{([((()))]())}]{{([])}[()]{{}()}}}()())())}}{()}}[(()(())((({{{{}}[]}})[[{[]((){()}[]([[]])({{([[{}[]]]([{}((){[[](){}{{}}]})[][({{}}()((([[][{}]]))))()[]()][()]{}()()]())([][]{[[{}[]()]]{}[]}))}}))}[]]{}])))({})]}()[{()}][][[]]()[{{(([])){()}}}((){}[])]{[][]([()])}([]){}{(()){{}}}{()}{{{}({[()()()]}(((){[[(())]]{[]}{{}{}[][()][{{[]}{}{}({})[]}[]]}([])({})[[]]()})))}()}(())()(){[]((()[]))}{[][{}]}((())){}{}{}{}{[{}()][{()}][]}{}[{{}[({({}{()})}){{}}{{{{}}}[]}(([]())[])({[]}{}{})]}]{}{[[([])]{((){{{}{[]}}[[(()[()[{[]()[[()]{{[[]]}[[[]{((){})}[{()[]}]{[{()}]}]]}()]}]({{[]{}[]}}[(()[{{}}])()]{{}()}({{}}(({})[])[[{({}{[{[[{{(({{{}}(){{{}}}}()))}()}]{(({{}}){}())()}]()}{}]{}{{[]{}[[(([]))]][]({}[]()())}}})}]]))])]]})}]}";
        char[] exp = a.toCharArray();


//        char exp[] = {'{','(','(',')','}','[',']'};
        if(areParenthesisBalance(exp)){
            System.out.println("Balanced");
        }else{
            System.out.println("Not Balanced");
        }
    }
}
