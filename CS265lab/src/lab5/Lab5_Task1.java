package lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab5_Task1 {
    Lab5_Program1 zz=new Lab5_Program1();

    @Test
    void taxRelief1() {
        assertEquals(0,zz.taxRelief(17,true));
    }
    @Test
    void taxRelief2() {
        assertEquals(800,zz.taxRelief(19,true));
    }
    @Test
    void taxRelief3() {
        assertEquals(1600,zz.taxRelief(56,true));
    }@Test
    void taxRelief4() {
        assertEquals(3200,zz.taxRelief(56,false));
    }
    @Test
    void taxRelief5() {
        assertEquals(1600,zz.taxRelief(19,false));
    }

}