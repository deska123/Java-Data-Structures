/** 
* This class implements a Node with previous and next link in a Linked List
* Type of data inside its container is in generic type
*
* @author Dennis Pratama Kamah 
* @version 2017.09.03
* @param <T>
**/
public class DynamicNode<T> 
{
    private DynamicNode previousNode;
    private DynamicNode nextNode;
    private T data;

    public DynamicNode(T data) {
        this.previousNode = null;
        this.nextNode = null;
        this.data = data;
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
    public DynamicNode getNextNode()
    {
        return this.nextNode;
    }
    
    /**
    * Sets next node of this node
    **/
    public void setNextNode(DynamicNode newNextNode)
    {
        this.nextNode = newNextNode;
    }
    
    /**
    * Returns previous node of this node
    * @return previous node
    **/
    public DynamicNode getPreviousNode()
    {
        return this.previousNode;
    }
    
    /**
    * Sets previous node of this node
    **/
    public void setPreviousNode(DynamicNode newNode)
    {
        this.previousNode = newNode;
    }
}
