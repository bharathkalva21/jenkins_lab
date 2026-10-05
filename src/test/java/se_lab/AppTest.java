package se_lab;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    void testSum() {
        assertEquals(5, App.sum(2, 3));
    }
}