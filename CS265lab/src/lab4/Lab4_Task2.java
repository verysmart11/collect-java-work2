package lab4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab4_Task2 {
    Lab4_Program2 z=new Lab4_Program2();

    @Test
    void grade1() {
        assertEquals("Marks out of range",z.grade(-1,-1));
    }
    @Test
    void grade2() {
        assertEquals("Fail",z.grade(49,49));
    }
    @Test
    void grade3() {
        assertEquals("Pass,C",z.grade(51,60));
    }@Test
    void grade4() {
        assertEquals("Pass,A",z.grade(70,70));
    }
    @Test
    void grade5() {
        assertEquals("Pass,B",z.grade(69,69));
    }

}