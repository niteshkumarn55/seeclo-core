package com.sort;


import java.util.*;

class Person {
    String firstName;
    String lastName;
    int age;
    String country;

    public Person(String firstName, String lastName, int age, String country) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getFirstName(), person.getFirstName()) &&
                Objects.equals(getLastName(), person.getLastName()) &&
                Objects.equals(getCountry(), person.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAge(), getCountry());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return firstName + "|" + lastName + "|" + age + "|" + country;
    }
}

class FirstNameSorter implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class LastNameSorter implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

class AgeSorter implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
    }
}

class CountrySorter implements Comparator<Person>
{
    public int compare(Person o1, Person o2)
    {
        return o1.getCountry().compareTo(o2.getCountry());
    }
}


class GroupBySorter implements Comparator<Person> {

    private List<Comparator<Person>> listComparators;

    public GroupBySorter(List<Comparator<Person>> comparators) {
        this.listComparators = comparators;
    }

    public int compare(Person pOne, Person pTwo) {
        for (Comparator<Person> comparator : listComparators) {
            int result = comparator.compare(pOne, pTwo);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}

class PersonUtils {
    public static void sortPersons(List<Person> persons, String[] sortBy) {
        // implement the sorting logic

        FirstNameSorter f = new FirstNameSorter();
        LastNameSorter l = new LastNameSorter();
        AgeSorter a = new AgeSorter();
        CountrySorter c = new CountrySorter();
        List<Comparator<Person>> l1 = new ArrayList<Comparator<Person>>();
        for(String sortName : sortBy){
            if(sortName.equalsIgnoreCase("firstName")){
                l1.add(f);
            }else if(sortName.equalsIgnoreCase("lastName")){
                l1.add(l);
            }else if(sortName.equalsIgnoreCase("age")){
                l1.add(a);
            }else if(sortName.equalsIgnoreCase("country")){
                l1.add(c);
            }
        }
        Collections.sort(persons, new FirstNameSorter().thenComparing(new LastNameSorter()).thenComparing(new AgeSorter())); //Sort by firstname then by lastname then by age
        Collections.sort(persons, new GroupBySorter(l1)); //Made dynamic instead of hardcoding like the above line. The data is take by the sortBy Array
        System.out.println(persons);

    }
    public static void main(String[] args){
        String[] s = {"firstName", "country"}; // First sort by first name then country -> print the result sorted based on this combination
        List a  = new ArrayList<>();
            a.add(new Person("s","a",1,"c"));
        a.add(new Person("d","f",2,"r"));
        sortPersons(a, s);

//        a.stream().mapToInt(a);

    }
}