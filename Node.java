import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Node {
    protected String item;//stores the grocery item
    protected Node next;//is the node

    public Node(){//instantiates the variables with null/no value
        next=null;
        item="none";
    }
    public Node(String food){//instantiates the variables with the paramater
        try {
            item=isValidItem(food);
            next=null;
        } catch (Exception e) {
            next=null;
            item="none";

        }
        
    }
    public Node(String food, Node item){//initialises the variables based on parameters
         try {
            this.item=isValidItem(food);
            next=isValidNode(item);
        } catch (Exception e) {
            next=null;
            this.item="none";

        }
    }
    public String isValidItem(String food)throws FileNotFoundException{
        File f=new File("/Users/clmilligan/HCSS/Clemi-Grocery-Project/grocery-items.txt");
        Scanner s = new Scanner(f);
        Boolean isFood=false;
        while(s.hasNext()){
            String line =s.nextLine();
            int end=line.indexOf("\" " );
            String item=line.substring(1,end);
            if(item.equals(food)){
                isFood=true;
            }
        }
        if(isFood){
            return food;
        }
        else{
            return "none";
        }

    }
    public Node isValidNode(Node food)throws FileNotFoundException{
        File f=new File("/Users/clmilligan/HCSS/Clemi-Grocery-Project/grocery-items.txt");
        Scanner s = new Scanner(f);
        Boolean isFood=false;
        while(s.hasNext()){
            String line =s.nextLine();
            int end=line.indexOf("\" " );
            String item=line.substring(1,end);
            Node nodeTest=new Node(item);
            if(food.equals(nodeTest)){
                isFood=true;
            }
        }
        if(isFood){
            return food;
        }
        else{
            Node ret = new Node();
            return ret;
        }

    }
    
}
