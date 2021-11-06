package dev.warrensnipes.seminole_state_programming_competition.your_shift_is_over;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YourShiftIsOverTest {

    @Test
    public void testShiftIntegers() {
        Assertions.assertArrayEquals(YourShiftIsOver.shiftIntegers(new int[]{1, 2, 3, 4, 5, 6, 7, 0}, 2), new int[]{3, 4, 5, 6, 7, 1, 2});
        Assertions.assertArrayEquals(YourShiftIsOver.shiftIntegers(new int[]{4, 5, 6, 7, 8, 0}, 4), new int[]{8, 4, 5, 6, 7});
        Assertions.assertArrayEquals(YourShiftIsOver.shiftIntegers(new int[]{19, 33, -18, 33, 3, 0}, 5), new int[]{19, 33, -18, 33, 3});
        Assertions.assertArrayEquals(YourShiftIsOver.shiftIntegers(new int[]{1, 2, 3, 4, 5, 6, 7, 0}, 1), new int[]{2, 3, 4, 5, 6, 7, 1});

    }
}
