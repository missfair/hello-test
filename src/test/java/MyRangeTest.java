import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;


public class MyRangeTest {
    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) ผลที่ได้คือ true]")
    public  void startWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithInclude();
        assertEquals(true, result);
    }

    @Test
    @DisplayName("ข้อมูล (1,5] นั้นจะขึ้นต้นด้วย [ (exclude) ผลที่ได้คือ false]")
    public  void startWithExclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isStartWithExclude();
        assertEquals(false, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) ผลที่ได้คือ true]")
    public  void EndWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        boolean result = myRange.isEndWithInclude();
        assertEquals(true, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) ผลที่ได้คือ true]")
    public  void EndWithExclude(){
        MyRange myRange = new MyRange("[1,5)");
        boolean result = myRange.isEndWithExclude();
        assertEquals(true, result);
    }

    @Test
    @DisplayName("ข้อมูล [1,5] นั้นจะขึ้นต้นด้วย [ (include) ผลที่ได้คือ true]")
    public  void startNumberWithInclude(){
        MyRange myRange = new MyRange("[1,5]");
        int result = myRange.getStart();
        assertEquals(1, result);
    }

}
