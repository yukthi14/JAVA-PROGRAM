import java.util.ArrayList;

public class GENERICS {
    public static void main(String[] args) {
        ArrayList<Integer> myArrayList=new ArrayList(); //we specify int over here only
        myArrayList.add(20);
        myArrayList.add(67);
        myArrayList.add(45);
        myArrayList.add(89);
        int x=myArrayList.get(4);
        System.out.println(x);
    }
}
// used to resolve the bug,
//int x=(int)myArrayList.get(4);  //it produces run time error