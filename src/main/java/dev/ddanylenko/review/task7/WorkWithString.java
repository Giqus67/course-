package dev.ddanylenko.review.task7;

import java.util.*;

public class WorkWithString {

    public static void countVowels(String s) {
        Map<Character, Integer> vowels = new HashMap<Character, Integer>();
        for (char c : s.toLowerCase().toCharArray()) {
            vowels.put(c, vowels.getOrDefault(c, 0) + 1);
        }

        System.out.println("Count of A: " + vowels.get('a'));
        System.out.println("Count of E: " + vowels.get('e'));
        System.out.println("Count of I: " + vowels.get('i'));
        System.out.println("Count of O: " + vowels.get('o'));
        System.out.println("Count of U: " + vowels.get('u'));
    }

    public static void deleteSpace(String s) {
        String string = s.replaceAll("\\s+", "");
        System.out.println("String without spaces: " + string);
    }

    public static void findUnique(String s) {
        Set<String> set = new HashSet<>();
        String[] strings = s.split(" ");
        for(String str : strings) {
            set.add(str);
        }
        System.out.println("Unique words:");
        for(String str : set) {
            System.out.println(str);
        }
    }

    public static void compressString(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i - 1)) {
                count++;
            }
            else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        result.append(s.charAt(s.length() - 1)).append(count);
        System.out.println("Result of compress: " + result);
    }

    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase().replaceAll("\\s+", " ");
        str2 = str2.toLowerCase().replaceAll("\\s+", " ");

        if(str1.length() != str2.length()) {
            return false;
        }

        char[] charArray = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray, charArray2);
    }
}

