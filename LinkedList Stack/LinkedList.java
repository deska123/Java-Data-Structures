/** 
* This class implements a Singly Linked List Data Structure and Its Supporting Methods
* A Linked List only contains header node as its first controller
*
* @author Dennis Pratama Kamah 
* @version 2017.09.01
 * @param <T>
**/
public class LinkedList<T>
{
    private Node headerNode;
       
    /**
    * Default Constructor Singly LinkedList 
    * Initial header node is null
    **/
    public LinkedList() 
    {
        this.headerNode = null;
    }
    
    /**
    * Returns header node of linked list
    * @return header node
    **/
    public T getHeader()
    {
        return (T) this.headerNode.getData();
    }
    
    /**
    * Return the condition whether linked list is empty (or not)
    * @return true or false
    **/
    public boolean isEmpty()
    {
        return this.headerNode == null;
    }
    
    /**
    * Method to insert new header node
    * @param data a generic-typed data
    **/
    public void headerInsert(T data) 
    {
        Node newNode = new Node(data);
        if(!this.isEmpty()) {
            Node oldHeaderNode = this.headerNode;
            newNode.setNextNode(oldHeaderNode);
        }
        this.headerNode = newNode;
    }
    
    /**
    * Method to delete header node
    * @throws NullPointerException if linked list is empty
    **/
    public void headerDelete() 
    {
        if(this.isEmpty()) {
            throw new NullPointerException("No such header node to be deleted in this linked list");
        } else {
            this.headerNode = this.headerNode.getNextNode();
        }
    }
}