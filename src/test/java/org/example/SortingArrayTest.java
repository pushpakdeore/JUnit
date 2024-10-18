package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortingArrayTest {
    @Test
    void testArray()  {
        try{

            SortingArray s =new SortingArray();
            int[] unsorted = {2,7,32,34};
            int sorted[]  = s.sortArray(unsorted);
            for(int e:sorted){
                System.out.println(e);
            }
        }catch (NullPointerException e){
            System.out.println("null point");
        }

    }

}