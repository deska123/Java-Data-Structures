/** 
* This class implements a Queue using Linked List
* A Queue can only be accessed by calling its front element
*
* @author Dennis Pratama Kamah 
* @version 2017.10.08
 * @param <T>
**/
public class Queue<T>
{
    private LinkedList list;
    
    /**
    * Default Constructor Queue with Linked List
    * Initial header linked list in queue is null
    **/
    public Queue()
    {
        list = new LinkedList();
    }
    
    /**
    * Return the condition whether queue is empty (or not)
    * @return true or false
    **/
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    /**
    * Method to insert new element at back position of list
    * @param data a generic-typed data
    **/
    public void offer(T data) 
    {
        list.tailInsert(data);
    }
    
    /**
    * Returns front element of queue or header of list 
    * @return front element of queue
    * @throws NullPointerException if queue is empty
    **/
    public T getFront()
    {
        if(isEmpty()) {
            throw new NullPointerException("Queue is empty !!");
        }
        T output = (T) list.getHeader();
        return output;
    }
    
    /**
    * Returns front element of queue or header of list and remove it from list
    * @return front element of queue
    * @throws NullPointerException if queue is empty
    **/
    public T poll()
    {
        if(isEmpty()) {
            throw new NullPointerException("Queue is empty !!");
        }
        T output = (T) list.getHeader();
        list.headerDelete();
        return output;
    }
}