import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxMinTest {

    @Test
    public void arr1(){
        int []a = {};
        assertEquals(-1,MaxMin.Max(a));
        assertEquals(-1,MaxMin.Min(a));
    }

    @Test
    public void arr2(){
        int []a = {999,35,99,-112,-10,5,6};
        assertEquals(999,MaxMin.Max(a));
        assertEquals(-112,MaxMin.Min(a));
    }

}