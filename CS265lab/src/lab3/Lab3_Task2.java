package lab3;

import org.junit.jupiter.api.Test;

import javax.jws.Oneway;

import static org.junit.jupiter.api.Assertions.*;

class Lab3_Task2 {
    Lab3_Program2 z =new Lab3_Program2();

    @Test
    void discount1() {
        assertEquals(0,z.discount(20));
    }
    @Test
    void discount2() {
        assertEquals(0.05,z.discount(150));
    }
    @Test
    void discount3() {
        assertEquals(0.1,z.discount(300));
    }
    @Test
    void discount4() {
        assertEquals(0.15,z.discount(550));
    }
}