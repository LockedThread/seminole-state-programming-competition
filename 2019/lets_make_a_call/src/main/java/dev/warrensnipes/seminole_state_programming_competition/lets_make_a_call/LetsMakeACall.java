package dev.warrensnipes.seminole_state_programming_competition.lets_make_a_call;

import java.util.HashMap;
import java.util.Scanner;

public class LetsMakeACall {

    public static void main(String[] args) {
        HashMap<Character, Integer> map = generateMap();
        System.out.println(map);
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

    public static String getPhoneNumber(HashMap<Character, Integer> map, String phoneNumber) {
        char[] chars = phoneNumber.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : chars) {
            if (Character.isDigit(c) || c == '-') {
                builder.append(c);
            } else {
                builder.append(map.get(Character.toLowerCase(c)));
            }
        }
        return builder.toString();
    }

    public static HashMap<Character, Integer> generateMap() {
        HashMap<Character, Integer> map = new HashMap<>();
        int characterMapping = 97;
        for (int number = 2; number < 10; number++) {
            for (int i = 0; i < (number == 7 || number == 9 ? 4 : 3); i++) {
                map.put((char) characterMapping, number);
                characterMapping++;
            }
        }
        return map;
    }
}
