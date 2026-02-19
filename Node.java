public class Node {
    protected String item;
    protected Node next;

    public Node(){
        next=null;
        item="none";
    }
    public Node(String food){
        item=food;
        next=null;
    }
    public Node(String food, Node item){//confused about these parameters
        this.item=food;
        next=item;
    }
    public String getData() {
        return item;
    }
}
