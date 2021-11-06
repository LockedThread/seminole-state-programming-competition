package dev.warrensnipes.seminole_state_programming_competition.equivalent_strings;

import java.util.HashMap;
import java.util.Scanner;

public class EquivalentStrings {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String first = null;
            while (scanner.hasNext()) {
                String currentLine = scanner.nextLine();
                if (currentLine.equalsIgnoreCase("exit")) {
                    break;
                }
                if (first == null) {
                    first = currentLine;
                } else {
                    System.out.println((isEquivalent(first, currentLine) ? "" : "not ") + "equivalent");
                    first = null;
                }
            }
        }
    }

    /**
     * Utilizes a hashmap to test the comparison between the first and second string
     * We use a HashMap here because we can easily access and retrieve at O(1) time complexity.
     * The comparison is done by checking if the previously set character is equal to the currently compared chracter.
     *
     * @param first  the first string
     * @param second the comparing string
     * @return whether the strings are 'equivalent' by the competition's standards
     */
    public static boolean isEquivalent(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            char firstChar = first.charAt(i);
            char secondChar = second.charAt(i);
            Character old = map.put(firstChar, secondChar);
            if (old != null && old != secondChar) {
                return false;
            }
        }
        return true;
    }
}
