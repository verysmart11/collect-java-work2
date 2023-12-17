package lab5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab5_Task2 {
    Lab5_Program2 zz=new Lab5_Program2();

    @Test
    void phoneInsurance1() {
        assertEquals(0,zz.phoneInsurance(15,'P'));
    }
    @Test
    void phoneInsurance2() {
        assertEquals(75,zz.phoneInsurance(17,'I'));
    }
    @Test
    void phoneInsurance3() {
        assertEquals(40,zz.phoneInsurance(41,'A'));
    }
    @Test
    void phoneInsurance4() {
        assertEquals(45,zz.phoneInsurance(62,'W'));
    }
    @Test
    void phoneInsurance5() {
        assertEquals(50,zz.phoneInsurance(27,'A'));
    }


}