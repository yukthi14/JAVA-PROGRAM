import java.util.*;
public class ARRAY_LIST {
    public static void main(String[] args) {
        ArrayList<Integer>y1=new ArrayList<>();
        ArrayList<Integer>y2=new ArrayList<>();
        y1.add(6);
        y1.add(10);
        y1.add(7);
        y1.add(34);
        y1.add(0,1);
        for(int i=0;i< y1.size();i++){
            System.out.println(y1.get(i));
        }
    }
}
