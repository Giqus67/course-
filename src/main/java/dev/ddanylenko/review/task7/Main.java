package dev.ddanylenko.review.task7;

public class Main {
    public static void main(String[] args) {
        String string = "The 2025 Ballon d'Or was the 69th annual ceremony of the Ballon d'Or, presented by France Football, recognising the best footballers in the world in the 2024–25 season. For the fourth time in the history of the award, it was awarded based on the results of the season instead of the calendar year. This was the period from 1 August 2024 to 13 July 2025 (final of the 2025 FIFA Club World Cup) for the men's award, and to 2 August 2025 (final of the 2025 Copa América Femenina) for the women's award. " +
                "The ceremony took place on 22 September 2025, with the nominees having been announced on 7 August 2025.[2][3][4]";
        System.out.println("String: "  + string);
        WorkWithString.countVowels(string);
        WorkWithString.deleteSpace(string);
        WorkWithString.findUnique(string);
        WorkWithString.compressString("aaabbccsssssssssssssss");
        String str1 = "LISTEN";
        String str2 = "SILENT";
        System.out.println(str1 + " is anagram to " + str2 + " - " + WorkWithString.isAnagram(str1, str2));
    }
}
