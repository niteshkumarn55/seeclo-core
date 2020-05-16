package com.datastructures.stack;


import com.datastructures.Person;

import java.util.Objects;

public class StackMain {

    public static void main(String[] args) throws Exception{
        StackGeneric<String> intStack = new StackGeneric<>(7);
//        System.out.println("No index yet :: "+intStack.getIndex(1));
        System.out.println("No element added :: "+intStack.get(1));
        System.out.println("Empty :: "+intStack.isEmpty());
        System.out.println("Is full :: "+intStack.isFull());
        System.out.println("size :: "+intStack.size());
        System.out.println("Total limit :: "+intStack.totalSize());
        System.out.println("--------------------------------------");
        intStack.push("2");

        intStack.push("2");
        intStack.push("1");
        intStack.push("4");

//        System.out.println("Push :: "+intStack.push(1));
//        System.out.println("No index yet :: "+intStack.getIndex(1));
        System.out.println("element  :: "+intStack.get(1));
        System.out.println("Empty :: "+intStack.isEmpty());
        System.out.println("Is full :: "+intStack.isFull());
        System.out.println("size :: "+intStack.size());
        System.out.println("pop :: "+intStack.pop());
        System.out.println("pop :: "+intStack.pop());
        System.out.println("pop :: "+intStack.pop());
        intStack.popAll();
        intStack.push("1");
        intStack.push("5");
        System.out.println("size :: "+intStack.size());
        System.out.println("Peek :: "+ intStack.peek());


        Person person =  new Person("nitesh", 30);
        Person person2 =  new Person("varsha", 26);
        Person person3 =  new Person("smruthi", 28);
        Person person4 =  new Person("nitesh", 30);

        StackGeneric<Person> personStack = new StackGeneric<>(3);
        personStack.push(person3);
        personStack.push(person);
        personStack.push(person2);

        System.out.println(personStack.getIndex(person4));



    }
}

