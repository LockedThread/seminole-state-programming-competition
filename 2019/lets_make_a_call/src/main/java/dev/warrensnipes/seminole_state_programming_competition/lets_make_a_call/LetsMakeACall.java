package dev.warrensnipes.seminole_state_programming_competition.lets_make_a_call;

import java.util.HashMap;
import java.util.Scanner;

public class LetsMakeACall {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = generateMap();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(getPhoneNumber(map, s));
            }
        }
    }

    /**
     * 1-800-FLOWERS -> 1-800-3569377
     * 1-800-GOFEDEX -> 1-800-4633339
     * 1-GYM-FOR-RENT -> 1-496-367-7368
     *
     * @param map the phone keypad
     * @param phoneNumber the string alphanumeric phone number
     * @return the numeric phone number
     */
    public static String getPhoneNumber(HashMap<Character, Integer> map, String phoneNumber) {
        StringBuilder builder = new StringBuilder();
        for (char c : phoneNumber.toCharArray()) {
            if (Character.isDigit(c) || c == '-') {
                // if it is a digit or - then leave it
                builder.append(c);
            } else {
                // gets the integer from the character provided
                builder.append(map.get(Character.toLowerCase(c)));
            }
        }
        return builder.toString();
    }

    /**
     * @return a map of alphabetic character to the number it represents a phone keypad
     */
    public static HashMap<Character, Integer> generateMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        int characterMapping = 'a'; // a = 97
        // increment from 2 to 9
        for (int number = 2; number < 10; number++) {
            // on a phone keypad 7 and 9 have 4 numbers associated with them while the rest have 3
            for (int i = 0; i < (number == 7 || number == 9 ? 4 : 3); i++) {
                map.put((char) characterMapping, number);
                characterMapping++;
            }
        }
        return map;
    }
}
