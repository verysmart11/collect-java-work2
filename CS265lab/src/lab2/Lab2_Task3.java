package lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab2_Task3 {
Lab2_Program3 z=new Lab2_Program3();
    @Test
    void carInsurance1() {
        assertEquals(0,z.carInsurance(Integer.MIN_VALUE,'M',false));
    }
    @Test
    void carInsurance2() {
        assertEquals(0,z.carInsurance(15,'M',false));
    }@Test
    void carInsurance3() {
        assertEquals(2000,z.carInsurance(16,'M',false));
    }@Test
    void carInsurance4() {
        assertEquals(300,z.carInsurance(24,'F',false));
    }@Test
    void carInsurance5() {
        assertEquals(500,z.carInsurance(25,'M',false));
    }@Test
    void carInsurance6() {
        assertEquals(300,z.carInsurance(44,'F',true));
    }@Test
    void carInsurance7() {
        assertEquals(400,z.carInsurance(45,'M',false));
    }@Test
    void carInsurance8() {
        assertEquals(200,z.carInsurance(65,'F',false));
    }@Test
    void carInsurance9() {
        assertEquals(0,z.carInsurance(66,'M',true));
    }@Test
    void carInsurance10() {
        assertEquals(0,z.carInsurance(Integer.MIN_VALUE,'F',true));
    }@Test
    void carInsurance11() {
        assertEquals(0,z.carInsurance(15,'T',false));
    }

}