package lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab4_Task1 {
    Lab4_Program1 z=new Lab4_Program1();

    @Test
    void carInsurance1() {
        assertEquals(0,z.carInsurance(10,'M',true));
    }
    @Test
    void carInsurance2() {
        assertEquals(2000,z.carInsurance(24,'M',false));
    }
    @Test
    void carInsurance3() {
        assertEquals(200,z.carInsurance(46,'F',true));
    }
}