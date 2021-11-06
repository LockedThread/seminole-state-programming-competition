package dev.warrensnipes.seminole_state_programming_competition.lets_make_a_call;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LetsMakeACallTest {

    private HashMap<Character, Integer> map;

    @BeforeAll
    public void initializeMap() {
        this.map = LetsMakeACall.generateMap();
    }

    @Test
    public void testGetPhoneNumber() {
        assertEquals("1-800-3569377", LetsMakeACall.getPhoneNumber(map, "1-800-FLOWERS"));
        assertEquals("1-800-4633339", LetsMakeACall.getPhoneNumber(map, "1-800-GOFEDEX"));
        assertEquals("1-496-367-7368", LetsMakeACall.getPhoneNumber(map, "1-GYM-FOR-RENT"));
    }
}
