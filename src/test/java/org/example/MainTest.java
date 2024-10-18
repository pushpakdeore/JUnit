package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class MainTest{
    Main m;
    @Test
    void getgreetingMain(){
        m = new Main();
        String result =m.getgreeting();
        Assertions.assertEquals("Good Morning !",result);
    }
  
}