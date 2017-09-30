/** 
* This class implements a Node with next link in a Linked List
* Type of data inside its container is in generic type
*
* @author Dennis Pratama Kamah 
* @version 2017.09.01
* @param <T>
**/
public class Node<T>
{
    private T data;
    private Node nextNode;
    
    /**
    * Default Constructor Node of LinkedList
    * Initial next node is null
    * @param data data inside node
    **/
    public Node(T data)
    {
        this.data = data;
        this.nextNode = null;
    }
    
    /**
    * Returns data of node
    * @return data contained in a node
    **/
    public T getData()
    {
        return this.data;
    }
    
    /**
    * Returns next node of this node
    * @return next node
    **/
    public Node getNextNode()
    {
        return this.nextNode;
    }
    
    /**
    * Sets next node of this node
    **/
    public void setNextNode(Node newNextNode)
    {
        this.nextNode = newNextNode;
    }
}
