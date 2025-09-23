package dev.ddanylenko.review.task5;

import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task1.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("The 2025 Ballon d'Or"," was the 69th annual ceremony of the Ballon d'Or", " presented by France Football"," recognising the best footballers in the world in the 2024–25","" +
                " season. For the fourth time in the history of the award"," it was awarded based on the results of the season instead of the calendar year. " +
                "This was the period from 1 August 2024 to 13 July 2025"," (final of the 2025 FIFA Club World Cup) for the men's award"," and to 2 August 2025 " +
                "(final of the 2025 Copa América Femenina)"," for the women's award","The ceremony took place on 22 September 2025, " +
                "with the nominees having been announced on 7 August 2025.[2][3][4]"));

        List<Integer> list = List.of(1, 2, 5, 1, 12,1, 23, 23);
        List<Person> personList = Lists.getPersons();
        System.out.println("List of string: " +strings);
        WorkWithCollections.sortByLength(strings);
        System.out.println("List sorted by length = " +strings);

        WorkWithCollections.findMostFrequent("The 2025 Ballon d'Or was the 69th annual ceremony of the Ballon d'Or, presented by France Football, " +
                "recognising the best footballers in the world in the 2024–25 season. For the fourth time in the history of the award, it was awarded based on " +
                "the results of the season instead of the calendar year. This was the period from 1 August 2024 to 13 July 2025 " +
                "(final of the 2025 FIFA Club World Cup) for the men's award, and to 2 August 2025 (final of the 2025 Copa América Femenina) " +
                "for the women's award. The ceremony took place on 22 September 2025, with the nominees having been announced on 7 August 2025.[2][3][4]");

        System.out.println("List of integers: " +list + ". Deleted duplicates " + WorkWithCollections.deleteDuplicates(list));

        WorkWithCollections.workWithQueue(list);

        System.out.println("List of persons: " +personList);
        Collections.sort(personList, new PersonComparator());
        System.out.println("Sorted persons by age and name: " + personList);

    }

}
