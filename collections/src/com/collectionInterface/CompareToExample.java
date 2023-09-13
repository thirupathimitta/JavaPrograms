package com.collectionInterface;

class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person otherPerson) {
        return Integer.compare(this.age, otherPerson.age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class CompareToExample {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        int comparisonResult = person1.compareTo(person2);

        if (comparisonResult < 0) {
            System.out.println(person1.getName() + " is younger than " + person2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(person1.getName() + " is older than " + person2.getName());
        } else {
            System.out.println(person1.getName() + " and " + person2.getName() + " are of the same age.");
        }
    }
}
