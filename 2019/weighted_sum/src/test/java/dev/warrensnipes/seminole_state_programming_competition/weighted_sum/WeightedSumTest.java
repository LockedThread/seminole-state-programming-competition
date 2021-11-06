package dev.warrensnipes.seminole_state_programming_competition.weighted_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightedSumTest {

    @Test
    public void test1() {
        assertEquals(WeightedSum.getSum("57"), 19);
    }

    @Test
    public void test2() {
        assertEquals(WeightedSum.getSum("482178"), 113);
    }

    @Test
    public void test3() {
        assertEquals(WeightedSum.getSum("32058"), 67);
    }
}
