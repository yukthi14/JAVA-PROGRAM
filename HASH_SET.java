import java.util.HashSet;

public class HASH_SET {
    public static void main(String[] args) {
        HashSet<Integer>myHashset=new HashSet<>(7,0.56f);
        myHashset.add(10);
        myHashset.add(15);
        myHashset.add(17);
        myHashset.add(110);
        System.out.println(myHashset);

        System.out.println("myhashset before removing any element"+myHashset);
        myHashset.remove(15); //to remove an element from a list
        System.out.println("myhashset after removing a element"+myHashset);

        HashSet<Integer>myhashset1=new HashSet<>(); //to return boolean value
        System.out.println(myHashset.isEmpty());
        System.out.println(myhashset1.isEmpty());

        System.out.println("the size of myhashset:"+myHashset.size());

        System.out.println("myhashset before "+myHashset);
        myHashset.clear(); //to delete all element from a list
        System.out.println("myhashset after "+myHashset);


    }
}
/* [17, 10, 110, 15]
  myhashset before removing any element[17, 10, 110, 15]
  myhashset after removing a element[17, 10, 110]
  false
  true
  myhashset before [17, 10, 110]
  the size of myhashset:3
  myhashset after []  */