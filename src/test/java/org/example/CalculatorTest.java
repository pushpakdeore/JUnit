package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator c;
    @BeforeEach
    public void setUp(){
        c= new Calculator();
    }
    @Test
    public void testadd(){
        int result  =c.add(2,5);
        Assertions.assertEquals(7,result);

    }

    @Test
    public void testsubract(){
        int result  = c .sub(5,2);
        Assertions.assertEquals(3,result);
    }

    @Test
    public void testdivide(){
        int result =c.divide(4,2);
        Assertions.assertEquals(2,result);

    }
    @Test
    public void testmultiply(){
        int result = c.mul(3,2);
        Assertions.assertEquals(6,result);
    }

}