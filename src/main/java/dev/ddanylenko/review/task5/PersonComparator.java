package dev.ddanylenko.review.task5;

import dev.ddanylenko.module8.task1.Person;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        if(person1.getAge() > person2.getAge()){
            return 1;
        }
        else if(person1.getAge() < person2.getAge()){
            return -1;
        }
        return person1.getName().compareTo(person2.getName());
    }
}
