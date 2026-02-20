
import java.io.FileNotFoundException;

public class GroceryTester extends GroceryList{
    public static void main(String[] args)throws FileNotFoundException {
        Node test=new Node("chicken");
        GroceryList myList=new GroceryList(test);
        myList.add("eggs",0);
        myList.add("milk",1);
        myList.remove(0);
        System.out.println(myList.toString());
        System.out.println(myList.size());
        System.out.println(myList.indexOf("chicken"));
        System.out.println(myList.indexOf("eggs"));
        myList.add("mustard");
        System.out.println(myList.getGroceryMap());

    }
}
