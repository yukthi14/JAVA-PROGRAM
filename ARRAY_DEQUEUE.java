import java.util.ArrayDeque;
import java.util.ArrayList;

public class ARRAY_DEQUEUE extends Thread
{
    public static void main(String[] args) {
        ArrayDeque<Integer>y1=new ArrayDeque<>();
        y1.add(10);
        y1.add(12);
        y1.add(20);
        y1.addFirst(5);
        y1.offerFirst(10);
        System.out.println(y1);
        System.out.println(y1.getFirst());
        System.out.println(y1.getLast());

    }
}
