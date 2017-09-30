/** 
* This class implements a Stack using Linked List
* A Stack can only be accessed by calling its top element
*
* @author Dennis Pratama Kamah 
* @version 2017.09.29
 * @param <T>
**/
public class Stack<T>
{
    private LinkedList list;
    
    /**
    * Default Constructor Stack with Linked List
    * Initial header linked list in stack is null
    **/
    public Stack()
    {
        list = new LinkedList();
    }
    
    /**
    * Return the condition whether stack is empty (or not)
    * @return true or false
    **/
    public boolean isEmpty()
    {
        return list.isEmpty();
    }
    
    /**
    * Method to insert new element at top position or header of list
    * @param data a generic-typed data
    **/
    public void push(T data) 
    {
        list.headerInsert(data);
    }
    
    /**
    * Returns top element of stack or header of list 
    * @return top element of stack
    * @throws NullPointerException if stack is empty
    **/
    public T peek()
    {
        if(isEmpty()) {
            throw new NullPointerException("Stack is empty !!");
        }
        T output = (T) list.getHeader();
        return output;
    }
    
    /**
    * Returns top element of stack or header of list and remove it from list
    * @return top element of stack
    * @throws NullPointerException if stack is empty
    **/
    public T pop()
    {
        if(isEmpty()) {
            throw new NullPointerException("Stack is empty !!");
        }
        T output = (T) list.getHeader();
        list.headerDelete();
        return output;
    }
}