import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class GroceryList extends Node{
    private Node head; 
    public GroceryList(){//grocery constructor that instantiates the head/list with null
        head=null;
    }
    public GroceryList(Node head){//grocery constructor that instantiates the head/list with a value (from the parameters)
        this.head=head;
    }
    public void add(String item){
        Node incoming = new Node(item);//adds it to the second item not the first
        Node curr;
        if(head==null){
            curr=incoming;
        }
        else{
            curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=incoming;
        }
       
    }
    public void add(String item, int idx){//adds the item to a certain index in the node list
        Node incoming = new Node(item);
        if (head == null) {
            head = incoming;
        } 
        else if (idx<=size() && idx >=0){
            if (idx == 0) {
                incoming.next = head;
                head = incoming;
            } else {
                Node curr = head;
                for (int i=0; i<idx-1; i++) {
                    curr=curr.next;
                }
                incoming.next = curr.next;
                curr.next=incoming;
            }
        }
    }
    public void remove(int idx){//removes the item at a certain index in the list
        if (head != null && idx<size() && idx >=0) {
            
            if (idx == 0) {
                head = head.next;
            } else {
                Node curr = head;
                for (int i=0; i<idx-1; i++) {
                        curr=curr.next;
                    }
                curr.next=curr.next.next;
            }
        }
    }

    public int size(){//checks the size of the node
        int count = 0;
        Node curr = head;
            while (curr!=null) {
                curr=curr.next;
                count++;
            }
        return count;
    }
    public Map<String, Double> getGroceryMap() throws FileNotFoundException{//creates a map with the node
        File f=new File("/Users/clmilligan/HCSS/Grocery-Project/grocery-items.txt");
        Scanner s = new Scanner(f);
        Map<String,Double> grocMap=new HashMap<>();
        while(s.hasNext()){
            String line =s.nextLine();
            int end=line.indexOf("\" " );
            String item=line.substring(1,end);
            double price= Double.parseDouble(line.substring(end+2));
        
            if (indexOf(item)!=-1){//checks each item in the txt file with the node list
                grocMap.put(item,price);

            }
        }
        return grocMap;
    }
    public int indexOf(String data)  {//finds the index of an object
        int idx=0;
        Node curr = head;
        while(curr!=null) {
            if(data.equals(curr.item)){//check the items
                return idx;
            }
            idx++;
            curr=curr.next;
        }
        return -1;
    }
    public double getCost()throws FileNotFoundException{//gets the cost of the list
        double total=0.0;
        Map<String, Double> groceries=getGroceryMap();
        for(Double price: groceries.values()){//does it by accasing the map and adding the values
            total+=price;
        }
        return total;
    }
    public String toString(){//overrides the regular too string method and creates one that prints the node and the total cost
        try {
            String toRet = "";
            Node curr = head;
            while (curr!=null) {
                toRet+=(curr.item + " ");
                curr = curr.next;
            }
            return "Your basket has: " +toRet+"\n And a total cost of: $"+getCost();
        } catch (Exception e) {
            e.printStackTrace();
            return ("no file found");
        } 
    }

    
}

