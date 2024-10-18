package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumberTest {
    EvenNumber e = new EvenNumber();

    @ParameterizedTest
    @ValueSource(ints ={2,4,6,8})
    void testvalideven(int even){
        assertTrue(e.isevennumber(even));
    }
    @ParameterizedTest
    @ValueSource(ints ={3,5,7,9})
    void testinvalideven(int noteven){
        assertFalse(e.isevennumber(noteven));
    }


}