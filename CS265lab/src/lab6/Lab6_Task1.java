package lab6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab6_Task1 {
    Lab6_Program1 zz =new Lab6_Program1();
    @Test
    void engineService11() {
        assertEquals(true,zz.engineService(16000,11,1100));
    }

    @Test
    void engineService12() {
        assertEquals(false,zz.engineService(16000,11,900));
    }

    @Test
    void engineService13() {
        assertEquals(false,zz.engineService(14000,11,1100));
    }

}