package com.GenericsJava;


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


class Person{
    private String name;
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
                Objects.equals(getAge(), person.getAge());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}
