package com.Java8;

import com.sun.tools.corba.se.idl.StringGen;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLearning {

    public static void main(String[] args) {

        // MAP / Filter / Reduce
        String[] v = {"nitesh", "varsha", "smruthi", "manju"};
        List<String> names = Arrays.asList(v);
        List<String> newNames = new ArrayList<>();
        Predicate<String> p1 = Predicate.isEqual("nitesh");
        Predicate<String> p2 = Predicate.isEqual("varsha");
        names.stream().filter(p1.or(p2)).forEach(s->newNames.add(s));


        System.out.println("Size is :: "+newNames.size());

        // FlatMap
        List<Integer> list1 = Arrays.asList(1,2,5,4,3);
        List<Integer> list2 = Arrays.asList(6,7,8);
        List<Integer> list3 = Arrays.asList(9,10);

        List<Person> p = new ArrayList<>();
        p.add(new Person("nitesh", 30));
        p.add(new Person("Varsha", 26));
        p.add(new Person("sakthi", 5));
        p.add(new Person("laveen", 2));

        List<List<Integer>> list = Arrays.asList(list1,list2,list3);
        System.out.println(list);

        list.stream().map(l -> l.size()).forEach(System.out::println);
        System.out.println("________________");
        list.stream().map(l->l.stream()).forEach(System.out::println);
        System.out.println("________FlatMap________");
        list.stream().flatMap(l->l.stream()).forEach(System.out::println);
        Stream<Integer> stream = list1.stream();
        System.out.println(stream.reduce(0,(l1,l2)->l1+l2));
        System.out.println("The max :: "+list1.stream().reduce((l1,l2) -> (l1<l2) ?l1 :l2 ).get());
        list1.stream().max(Comparator.naturalOrder());
        Optional<Integer> optionalPersonAge = p.stream().map(per -> per.getAge()).filter(a -> a >20).min(Comparator.naturalOrder());
        if(optionalPersonAge.isPresent()){
            System.out.println(optionalPersonAge.get());
        }
        String s = p.stream().filter(a -> a.getAge()>4).map(per -> per.getName()).collect(Collectors.joining(", "));
        System.out.println("The names joined :: "+s);
        Map<Integer, List<Person>> map = p.stream().filter(a->a.getAge()>3).collect(Collectors.groupingBy(b->b.getAge()));
        System.out.println(map);

        Map<Integer, Long> countPerson = p.stream().filter(a->a.getAge()>3).collect(Collectors.groupingBy(b->b.getAge(),Collectors.counting()));
        System.out.println(countPerson);
        Map<Integer, List<String>> personNames = p.stream().
                filter(a->a.getAge()>3
                ).collect(Collectors.
                groupingBy(
                        b->b.getAge(),Collectors.mapping(Person::getName, Collectors.toList())
                        )
        );
        System.out.println(personNames);

        Map<Integer,Set<String>> personSet = p.stream().
                filter(a->a.getAge()>3
                ).collect(Collectors.
                groupingBy(
                        b->b.getAge(),Collectors.mapping(Person::getName, Collectors.toCollection(TreeSet::new))
                )
        );
        System.out.println(personSet);



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


/*
* Java 8
* What is Map / Filter / Reduce
* Map: Is to operate on all the values and give back the new Result of those value.
* Example: you provide a list of elements and you want the names to be made uppercase in it. map does it for you and give the updated result.
* Filter: It takes the list and gives back the filter list to you.
* Example: Filter by age greater than 18. this provides the result of list where the age is greater than 18.
* Reduce : think of it as SQL aggregator functions.
* Example: Finding the min in the list, max or grouping my age etc...
*
* What is a Stream?
* Stream is an interface with type <T>. Meaning it can have streams of integers, customers, person etc... Its is completely different from collection.
* It might look like collection but it is not collection.
* It is used to efficiently process the data, it can process large amount of data, small amount of data or it can process data parallely.
* It leverages the computer mutlicore cpu's
* all process can be pipelined.
* Streams doesn't hold any data. but collection does. The stream will not change the data that it processes,
* has it uses parallel streaming might cause atomicity issues if it does.
*
*
*
* */