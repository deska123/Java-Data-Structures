/** 
* This class implements a Stack using Array
* A Stack can only be accessed by calling its top element
*
* @author Dennis Pratama Kamah 
* @version 2017.09.29
 * @param <T>
**/
public class Stack<T>
{
    private int size;
    private T[] arr;
    private int top;
    
    /**
    * Default Constructor Stack with Array
    * Initial top value is -1 and size is 5000
    **/
    public Stack()
    {
        size = 5000;
        arr = (T[]) new Object[size]; 
        top = -1;
    }
    
    /**
    * Return the condition whether stack is full (or not)
    * @return true or false
    **/
    public boolean isFull()
    {
        return top == (size - 1);
    }
    
    /**
    * Double the size of array 
    * and copy each element of old array into new-sized array
    **/
    public void arrayDoubling()
    {
        T[] newArr = arr;
        int oldSize = size;
        size *= 2;
        arr = (T[]) new Object[size]; 
        for(int i = 0; i < oldSize; i++) {
            arr = (T[]) newArr[i];
        }
    }
    
    /**
    * Return the condition whether stack is empty (or not)
    * @return true or false
    **/
    public boolean isEmpty()
    {
        return top == -1;
    }
    
    /**
    * Method to insert new element at top position
    * @param data a generic-typed data
    **/
    public void push(T data) 
    {
        if(isFull()) {
            size *= 2;
            arrayDoubling();
        }
        arr[++top] = data;
    }
    
    /**
    * Returns top element of stack 
    * @return top element of stack
    * @throws NullPointerException if stack is empty
    **/
    public T peek()
    {
        if(isEmpty()) {
            throw new NullPointerException("Stack is empty !!");
        }
        return arr[top];
    }
    
    /**
    * Returns top element of stack and decrease the value of top
    * @return top element of stack
    * @throws NullPointerException if stack is empty
    **/
    public T pop()
    {
        if(isEmpty()) {
            throw new NullPointerException("Stack is empty !!");
        }
        return arr[top--];
    }
}
