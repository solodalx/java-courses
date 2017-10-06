import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 06.10.2017.
 */
public class StackTest {
    @Test
    public void testStack() {

        StackImpl s = new StackImpl(5);

        for (int i = 0; i < 5; ++i) {
            s.add(i);
        }

        for (int i = 4; i >= 0; --i) {
            Integer integer = s.get();
            assertEquals((Integer) i, integer);
        }

//        System.out.println(s.get());

    }

    @Test(expected = IllegalStateException.class)
    public void testStack2() {
        StackImpl s = new StackImpl(5);

        try {
            s.get();
        } catch (IllegalStateException e) {
            assertEquals("Stack is empty", e.getMessage());
            throw e;
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testStack3() {
        StackImpl s = new StackImpl(2);
        try {
            s.add(2);
            s.add(4);
            s.add(6);
        } catch (IllegalStateException e){
            assertEquals("Stack is full", e.getMessage());
            throw e;
        }
    }
}
