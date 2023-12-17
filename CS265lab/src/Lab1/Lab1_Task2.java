package Lab1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab1_Task2 {
    Lab1_Program2 z=new Lab1_Program2();
    @Test
    void text1() {
        assertEquals("Marks out of range",z.grade(-20,4));
    }
    @Test
    void text2() {
        assertEquals("Marks out of range",z.grade(5,101));
    }
    @Test
    void text3() {
        assertEquals("Fail",z.grade(7,90));
    }
    @Test
    void text4() {
        assertEquals("Pass,C",z.grade(55,55));
    }
    @Test
    void text5() {
        assertEquals("Pass,B",z.grade(66,56));
    }
    @Test
    void text6() {
        assertEquals("Pass,A",z.grade(76,76));
    }
}