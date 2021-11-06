package dev.warrensnipes.seminole_state_programming_competition.weighted_sum;

import java.util.Scanner;

public class WeightedSum {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.equalsIgnoreCase("exit")) {
                    break;
                }
                System.out.println(getSum(s));
            }
        }
    }

    public static int getSum(String s) {
        int sum = 0;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int integer = Integer.parseInt(String.valueOf(charArray[i]));
            // multiply the integer by the index + 1 to calculate the weighted sum
            sum += integer * (i + 1);
        }
        return sum;
    }
}
