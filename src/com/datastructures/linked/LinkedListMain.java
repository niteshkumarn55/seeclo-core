package com.datastructures.linked;

import com.datastructures.Person;

public class LinkedListMain {
    public static void main(String[] args) {
     LinkedListMain linkedListMain = new LinkedListMain();
     linkedListMain.LinkStringOps();
        linkedListMain.LinkedListPerson();
    }
    public void LinkStringOps() {
        SingleLinkedList<String> linkedList = new SingleLinkedList<>();
        linkedList.push("Nitesh");
        linkedList.push("Varsha");
//        linkedList.insertAfter("smruthi",linkedList.head.next);
        linkedList.append("Smruthi");
        linkedList.append("priyanka");
        System.out.println("++++++ The size is "+linkedList.size());
        linkedList.display();
        linkedList.pop();
        System.out.println("++++++ After POP ++++++ and the size is "+linkedList.size());
        linkedList.display();
        linkedList.deleteNode("Smruthi");
        System.out.println("++++++ After Deleting Node ++++++ and the size is "+linkedList.size());
        linkedList.display();
        linkedList.pop();
        System.out.println("++++++ After POP ++++++ and the size is "+linkedList.size());
        linkedList.display();
        linkedList.deleteNode("priyanka");
        System.out.println("++++++ After Deleting Node ++++++ and the size is "+linkedList.size());
        linkedList.display();

    }

    public void LinkedListPerson(){
        Person person =  new Person("nitesh", 30);
        Person person2 =  new Person("varsha", 26);
        Person person3 =  new Person("smruthi", 28);
        Person person4 =  new Person("priyanka", 30);
        SingleLinkedList<Person> linkedList = new SingleLinkedList<>();
        linkedList.push(person);
        linkedList.push(person2);
        linkedList.append(person3);
        linkedList.append(person4);
        System.out.println("++++++ The size is "+linkedList.size());
        linkedList.display();
        linkedList.pop();
        System.out.println("++++++ After POP ++++++ and the size is "+linkedList.size());
        linkedList.display();
        linkedList.deleteNode(new Person("smruthi",28));
        System.out.println("++++++ After Deleting Node ++++++ and the size is "+linkedList.size());
        linkedList.display();
        linkedList.pop();
        System.out.println("++++++ After POP ++++++ and the size is "+linkedList.size());
        linkedList.display();
        linkedList.deleteNode(new Person("priyanka",28));
        System.out.println("++++++ After Deleting Node ++++++ and the size is "+linkedList.size());
        linkedList.deleteNode(new Person("priyanka",30));
        System.out.println("++++++ After Deleting Node ++++++ and the size is "+linkedList.size());
        linkedList.display();
        linkedList.pop();
        linkedList.deleteNode(new Person("priyanka",28));


    }

}
