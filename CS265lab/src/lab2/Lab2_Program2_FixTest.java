package lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab2_Program2_FixTest {

    Lab2_Program2_Fix Z=new Lab2_Program2_Fix();

    @Test
    void grade1() {
        assertEquals("Marks out of range",Z.grade(Integer.MIN_VALUE,0));
    }
    @Test
    void grade2() {
        assertEquals("Marks out of range",Z.grade(Integer.MAX_VALUE,0));
    }@Test
    void grade3() {
        assertEquals("Marks out of range",Z.grade(-1,0));
    }@Test
    void grade13() {
        assertEquals("Marks out of range",Z.grade(101,0));
    }
    @Test
    void grade4() {
        assertEquals("Fail",Z.grade(0,0));
    }@Test
    void grade5() {
        assertEquals("Fail",Z.grade(49,49));
    }@Test
    void grade6() {
        assertEquals("Pass,C",Z.grade(50,50));
    }@Test
    void grade7() {
        assertEquals("Pass,C",Z.grade(60,50));
    }@Test
    void grade8() {
        assertEquals("Pass,B",Z.grade(61,50));
    }@Test
    void grade9() {
        assertEquals("Pass,A",Z.grade(70,70));
    }
    @Test
    void grade10() {
        assertEquals("Pass,A",Z.grade(100,100));
    }
    @Test
    void grade11() {
        assertEquals("Fail",Z.grade(49,50));
    }
    @Test
    void grade12() {
        assertEquals("Fail",Z.grade(50,49));
    }


    @Test
    void grade14() {
        assertEquals("Marks out of range",Z.grade(0,Integer.MIN_VALUE));
    }
    @Test
    void grade15() {
        assertEquals("Marks out of range",Z.grade(0,Integer.MAX_VALUE));
    }@Test
    void grade16() {
        assertEquals("Marks out of range",Z.grade(0,-1));
    }@Test
    void grade17() {
        assertEquals("Marks out of range",Z.grade(0,101));
    }
}