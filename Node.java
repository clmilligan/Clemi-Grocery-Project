public class Node {
    protected String item;//stores the grocery item
    protected Node next;//is the node

    public Node(){//instantiates the variables with null/no value
        next=null;
        item="none";
    }
    public Node(String food){//instantiates the variables with the paramater
        item=food;
        next=null;
    }
    public Node(String food, Node item){//initialises the variables based on parameters
        this.item=food;
        next=item;
    }
    
}
