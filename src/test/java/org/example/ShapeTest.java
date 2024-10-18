package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
    Shape s =new Shape();
    @Test
    void testSquare(){
        double result = s.square(2,2);
        Assertions.assertEquals(4,result);

    }
    @Test
    void difftestSquare(){
        double result = s.square(5,2);
        Assertions.assertEquals(10,result);
    }

}