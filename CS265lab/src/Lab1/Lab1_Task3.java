package Lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab1_Task3 {
    Lab1_Program3 z=new Lab1_Program3();

    @Test
    void carInsurance1() {
        assertEquals(z.carInsurance(5,'M',false),0);
    }
    @Test
    void carInsurance2() {
        assertEquals(z.carInsurance(20,'M',false),2000);
    }
    @Test
    void carInsurance3() {
        assertEquals(z.carInsurance(20,'M',true),300);
    }
    @Test
    void carInsurance4() {
        assertEquals(z.carInsurance(47,'F',true),200);
    }
    @Test
    void carInsurance5() {
        assertEquals(z.carInsurance(27,'F',false),300);
    }
    @Test
    void carInsurance6() {
        assertEquals(z.carInsurance(27,'M',false),500);
    }
    @Test
    void carInsurance7() {
        assertEquals(z.carInsurance(66,'F',true),0);
    }
    @Test
    void carInsurance8() {
        assertEquals(z.carInsurance(47,'T',true),0);
    }
    @Test
    void carInsurance9() {
        assertEquals(z.carInsurance(47,'M',false),400);
    }




}