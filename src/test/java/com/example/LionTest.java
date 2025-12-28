package com.example;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.*;

public class LionTest {

    @Test
    public void maleLionTestHasMane() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void femaleLionTestHasNoMane() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void lionTestThrowsExceptionForInvalidSex() throws Exception {
        new Lion("Котик");
    }

    @Test
    public void getKittensTestReturnsOne() throws Exception {
        Lion lion = new Lion("Самка");
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodTestReturnsPredatorFood() throws Exception {
        Lion lion = new Lion("Самец");
        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
