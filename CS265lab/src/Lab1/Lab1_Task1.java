package Lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab1_Task1 {
    Lab1_Program1 z = new Lab1_Program1();
    @Test
    void text1() {
       assertEquals(20,z.calcInsurance(true, true));
    }
    @Test
    void text2() {
        assertEquals(10,z.calcInsurance(false, true));
    }
    @Test
    void text3() {
        assertEquals(5,z.calcInsurance(false, false));
    }

}