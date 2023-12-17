package lab2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Lab2_Program1_FixTest {

    Lab2_Program1_Fix z=new Lab2_Program1_Fix();
    @Test
    void discount1() {
        assertEquals(0,z.discount(0));
    }


    @Test
    void discount2(){
        assertEquals(0,z.discount(1));
    }
    @Test
    void t3(){
        assertEquals(0,z.discount(50));
    }
    @Test
    void t4(){
        assertEquals(0.05,z.discount(51));
    }
    @Test
    void t5(){
        assertEquals(0.05,z.discount(200));
    }
    @Test
    void t6(){
        assertEquals(0.1,z.discount(201));
    }
    @Test
    void t7(){
        assertEquals(0.1,z.discount(500));
    }
    @Test
    void t8(){
        assertEquals(0.15,z.discount(501));
    }
    @Test
    void t9(){
        assertEquals(0,z.discount(Integer.MIN_VALUE));
    }
    @Test
    void t10(){
        assertEquals(0.15,z.discount(Integer.MAX_VALUE));
    }

}