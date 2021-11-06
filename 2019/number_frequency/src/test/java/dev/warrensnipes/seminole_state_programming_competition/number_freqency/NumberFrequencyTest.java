package dev.warrensnipes.seminole_state_programming_competition.number_freqency;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberFrequencyTest {

    @Test
    public void test1() {
        HashMap<Integer, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put(1, 3);
        expectedOutput.put(44, 4);
        expectedOutput.put(55, 1);
        expectedOutput.put(78, 1);
        expectedOutput.put(100, 2);

        HashMap<Integer, Integer> testMap = NumberFrequency.getFrequencyMap("44 44 78 44 100 1 1 1 100 44 55 0");
        assertEquals(testMap, expectedOutput);
    }

    @Test
    public void test2() {
        HashMap<Integer, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put(44, 1);

        HashMap<Integer, Integer> testMap = NumberFrequency.getFrequencyMap("44 0");
        assertEquals(testMap, expectedOutput);
    }

    @Test
    public void test3() {
        HashMap<Integer, Integer> expectedOutput = new HashMap<>();
        expectedOutput.put(1, 2);
        expectedOutput.put(19, 1);
        expectedOutput.put(22, 4);
        expectedOutput.put(33, 2);
        expectedOutput.put(34, 1);
        expectedOutput.put(65, 1);
        expectedOutput.put(99, 3);
        expectedOutput.put(100, 2);

        HashMap<Integer, Integer> testMap = NumberFrequency.getFrequencyMap("99 1 19 1 22 100 22 33 99 22 65 34 33 22 100 99 0");
        assertEquals(testMap, expectedOutput);
    }
}
