import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WatchTest {

    Watch watch = new Watch();

    @Test
    void Test1() {
        String str = "Aaaa";
        assertEquals(WatchFunc.watchfunc(str, watch), "Error wrong input. input can only be (a,b,c,d)");
    }
    @Test
    void Test2(){
        String str = "aabadcbabababaacd";
        assertEquals(WatchFunc.watchfunc(str, watch), "2000-1-1");
    }
    @Test
    void Test3(){
        String str = "caabd";
        assertEquals(WatchFunc.watchfunc(str, watch), "2000-1-2");
    }
}

