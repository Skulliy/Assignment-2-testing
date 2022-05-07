import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddTest {


    @Test
    public void zeroIsEven(){
        assertEquals("Even", OddOrEven.check(0));
    }

    @Test
    public void fourIsEven(){
        assertEquals("Even", OddOrEven.check(4));
    }

    @Test
    public void threeIsOdd(){
        assertEquals("Odd", OddOrEven.check(3));
    }
 }

