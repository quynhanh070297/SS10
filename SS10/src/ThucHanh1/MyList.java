package ThucHanh1;

import java.util.Arrays;

public class MyList<E>
{
    private int size = 0;
    private static final int DEFAULT_CAPACITY= 10;
    private Object elememt[];

    public MyList(){
        elememt = new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapa()
    {
        int newSize = elememt.length*2;
        elememt = Arrays.copyOf(elememt, newSize);
    }
    public void add(E e)
    {
        if (size ==  elememt.length)
        {
            ensureCapa();;
        }
        elememt[size++] = e;
    }
    public E get(int i )
    {
        if (i>=size || i<0)
        {
            throw new IndexOutOfBoundsException("Index: "+ i+ ",Size"+i);
        }
        return (E) elememt[i];
    }
}
