/** 
* This class implements an Array List using conventional array
* An Array List is a dynamic array without specific size 
*
* @author Dennis Pratama Kamah 
* @version 2017.10.01
 * @param <T>
**/
public class ArrayList<T> 
{
    private int size;
    private T[] arr;
    private int last;
    
    /**
    * Default Constructor Array List using conventional array
    * Initial last index of Array List is -1
    **/
    public ArrayList()
    {
        size = 5000;
        arr = (T[]) new Object[size];
        last = -1;
    }
    
    /**
    * Return the condition whether Array List is empty (or not)
    * @return true or false
    **/
    public boolean isEmpty()
    {
        return last == -1;
    }
    
     /**
    * Return the condition whether Array List is full (or not)
    * @return true or false
    **/
    public boolean isFull()
    {
        return last == size - 1;
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
    * Returns size of Array List
    * @return size of Array List
    **/
    public int size()
    {
        return last + 1;
    }
    
    /**
    * Method to insert new element to the latest index position in Array List
    * @param data a generic-typed data
    **/
    public void add(T data)
    {
        if(isFull()) {
            arrayDoubling();
        }
        arr[++last] = data;
    }
    
    /**
    * Returns element at specified index
    * @return element at specified index
    * @throws ArrayIndexOutOfBoundsException if index is out of range
    **/
    public T get(int index)
    {
        if(index > last || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index is out of range of Array List");
        }
        return arr[index];
    }
    
    /**
    * Method to set element at specified index
    * @param index index of element in array to be set
    * @param newData a generic-typed data
    * @throws ArrayIndexOutOfBoundsException if index is out of range
    **/
    public void set(int index, T newData)
    {
        if(index > last || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index is out of range of Array List");
        }
        arr[index] = newData;
    }
}
