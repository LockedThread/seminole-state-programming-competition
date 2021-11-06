package dev.warrensnipes.seminole_state_programming_competition.equivalent_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EquivalentStringsTest {

    @Test
    public void testIsEquivalent() {
        assertTrue(EquivalentStrings.isEquivalent("zyzyyx", "cocoon"));
        assertFalse(EquivalentStrings.isEquivalent("banana", "orange"));
        assertFalse(EquivalentStrings.isEquivalent("darker", "posse"));
        assertTrue(EquivalentStrings.isEquivalent("albatross", "bombshell"));

    }
}
