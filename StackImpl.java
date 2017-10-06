import java.util.ArrayList;

/**
 * Created by user on 06.10.2017.
 */
public class StackImpl implements Stack {

    final private int stack[];
    private int count;

    public StackImpl(int size) {
        count = 0;
        stack = new int[size];
    }

    @Override
    public Integer get() {
        if (count == 0)
            throw new IllegalStateException("Stack is empty");

        return stack[--count];
    }

    @Override
    public void add(Integer i) {
        if (count >= stack.length)
            throw new IllegalStateException("Stack is full");

        stack[count++] = i;
    }

    public void ToString() {
        for (int i = 0; i < count; ++i) {
            System.out.print(stack[i] + ' ');
            System.out.println();
        }
    }
}





