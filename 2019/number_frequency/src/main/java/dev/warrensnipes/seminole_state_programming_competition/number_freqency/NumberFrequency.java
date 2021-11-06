package dev.warrensnipes.seminole_state_programming_competition.number_freqency;

import java.util.*;

public class NumberFrequency {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.equalsIgnoreCase("exit")) {
                    break;
                }
                printFrequencyMap(getFrequencyMap(s));
            }
        }
    }

    public static HashMap<Integer, Integer> getFrequencyMap(String numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Splits the 'numbers' string by a space to
        String[] numberStrings = numbers.split(" ");
        for (String numberString : numberStrings) {
            int number = Integer.parseInt(numberString);
            // Ensures that the number is positive and between 1 and 100 inclusive
            if (number >= 1 && number <= 100) {
                // Computes the value for the key, if the value is null then we start the count,
                // if not then it increments
                map.compute(number, (key, value) -> value == null ? 1 : value + 1);
            }
        }
        return map;
    }

    public static LinkedList<Integer> getSortedKeys(Map<Integer, Integer> map) {
        // I use a LinkedList over due to its O(1) time for insertion and lookup
        // Maintains order in which the entries are insrted
        LinkedList<Integer> keys = new LinkedList<>(map.keySet());
        // Compares all keys against all other keys
        // Runtime Complexity: O(n) x O(log(n)
        keys.sort(Comparator.comparingInt(i -> i));
        return keys;
    }

    public static void printFrequencyMap(Map<Integer, Integer> map) {
        LinkedList<Integer> sortedKeys = getSortedKeys(map);
        for (int key : sortedKeys) {
            System.out.printf("%d occurs %d times\n", key, map.get(key));
        }
    }
}
