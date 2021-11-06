package dev.warrensnipes.seminole_state_programming_competition.your_shift_is_over;

import java.util.ArrayList;
import java.util.Scanner;

public class YourShiftIsOver {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int shift = Integer.MIN_VALUE;
            System.out.println("Enter the shift number");
            while (scanner.hasNext()) {
                String currentLine = scanner.nextLine();
                if (currentLine.equalsIgnoreCase("exit")) {
                    break;
                }
                if (shift == Integer.MIN_VALUE) {
                    shift = Integer.parseInt(currentLine);
                    System.out.println("Enter the numbers in list separated by space. End with 0.");
                } else {
                    String[] s = currentLine.split(" ");
                    int[] array = new int[s.length];
                    for (int i = 0; i < s.length; i++) {
                        array[i] = Integer.parseInt(s[i]);
                    }
                    StringBuilder formatted = new StringBuilder();
                    for (int i : shiftIntegers(array, shift)) {
                        formatted.append(i).append(" ");
                    }
                    System.out.println("Output: " + formatted);
                    shift = Integer.MIN_VALUE;
                    System.out.println("Enter the shift number");

                }
            }
        }
    }

    public static int[] shiftIntegers(int[] array, int shiftAmount) {
        ArrayList<Integer> original = new ArrayList<>();
        for (int i : array) {
            if (i == 0) break;
            original.add(i);
        }
        int[] shifted = new int[original.size()];

        for (int i = 0; i < original.size(); i++) {
            shifted[i] = original.get((shiftAmount + i) % original.size());
        }
        return shifted;
    }

}
