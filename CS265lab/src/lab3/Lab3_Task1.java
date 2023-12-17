package lab3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab3_Task1 {
    Lab3_Program1 z=new Lab3_Program1();

    @Test
    void calcInsurance1() {
        assertEquals(20,z.calcInsurance(true,true));
    }
    @Test
    void calcInsurance2() {
        assertEquals(10,z.calcInsurance(true,false));
    }
    @Test
    void calcInsurance3() {
        assertEquals(10,z.calcInsurance(false,true));
    }
    @Test
    void calcInsurance4() {
        assertEquals(5,z.calcInsurance(false,false));
    }
}