package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceTest {
    Service s;
    @Test
    void getNameNegativeNumberTest(){
        s =new Service();
        String result=s.getName(-1);
        Assertions.assertEquals("a",result);

    }
    @Test
    void getNamePositiveNumber(){
        s =new Service();
        String result =s.getName(12);
        Assertions.assertEquals("b",result);
    }
    @Test
    void getNameZeroNumber(){
        s =new Service();
        String result =s.getName(0);
        Assertions.assertEquals("c",result);
    }

}