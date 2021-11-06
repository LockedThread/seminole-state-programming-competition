package dev.warrensnipes.seminole_state_programming_competition.weighted_sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeightedSumTest {

    @Test
    public void test1() {
        assertEquals(19, WeightedSum.getSum("57"));
    }

    @Test
    public void test2() {
        assertEquals(113, WeightedSum.getSum("482178"));
    }

    @Test
    public void test3() {
        assertEquals(67, WeightedSum.getSum("32058"));
    }
}
