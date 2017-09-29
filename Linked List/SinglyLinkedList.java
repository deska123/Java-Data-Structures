/** 
* This class implements a Singly Linked List Data Structure and Its Supporting Methods
* A Linked List only contains header node as its first controller
*
* @author Dennis Pratama Kamah 
* @version 2017.09.01
 * @param <T>
**/
public class SinglyLinkedList<T>
{
    private Node headerNode;
       
    /**
    * Default Constructor Singly LinkedList 
    * Initial header node is null
    **/
    public SinglyLinkedList() 
    {
        this.headerNode = null;
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
    * Make linked list to be emptied
    **/
    public void makeEmpty()
    {
        this.headerNode = null;
    }
    
    /**
    * Method to print Data of Header Node 
    * @throws NullPointerException if linked list is empty
    **/
    public void printHeaderNode()
    {
        if(!this.isEmpty()) {
            System.out.println(this.headerNode.getData());
        } else {
            throw new NullPointerException("There is no header node to be printed in this linked list");
        }
    }
    
    /**
    * Method to print all data in each node in linked list
    * starting from header node
    * @throws NullPointerException if linked list is empty
    **/
    public void printAll()
    {
        if(!this.isEmpty()) {
            Node current = this.headerNode;
            while(current != null) {
                System.out.println(current.getData());
                current = current.getNextNode();
            }
        } else {
            throw new NullPointerException("No such element nodes to be printed in this linked list");
        }
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
    * Method to insert new node as tail
    * @param data a generic-typed data
    **/
    public void insert(T data) 
    {
        Node current = this.headerNode;
        Node newNode = new Node(data);
        if(current == null) {
            this.headerNode = newNode;
        } else {
            while(current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
        }
    }
  
    /**
    * Method to insert new node after certain node which is found firstly from the header node
    * @param previousData data which new data will be inserted after
    * @param newData new data to be inserted
    * @throws NullPointerException if there is no previousData in linked list
    **/
    public void insertAfter(T previousData, T newData) 
    {
        Node current = this.headerNode;
        Node newNode = new Node(newData);
        while(current != null) {
           if(current.getData() == previousData) {
               break;
           }
           current = current.getNextNode();
        }
        if(current == null) {
            throw new NullPointerException("There is no element node containing " + previousData);
        } else {
            if(current.getNextNode() == null) {
                current.setNextNode(newNode);
            } else {
                Node nextNode = current.getNextNode();
                current.setNextNode(newNode);
                newNode.setNextNode(nextNode);
            }
        }
    }
    
    /**
    * Method to insert new node before certain node which is found firstly from the header node
    * @param nextData data which new data will be inserted before
    * @param newData new data to be inserted
    * @throws NullPointerException if there is no nextData in linked list
    **/
    public void insertBefore(T nextData, T newData) 
    {
        if(this.isEmpty()) {
            throw new NullPointerException("There is no element node containing " + nextData);
        } else {
            if(this.headerNode.getNextNode() == null) {
                if(this.headerNode.getData() == nextData) {
                    this.headerInsert(newData);
                } else {
                    throw new NullPointerException("There is no element node containing " + nextData);
                }
            } else {
                if(this.headerNode.getData() == nextData) {
                    this.headerInsert(newData);
                } else {
                    Node current = this.headerNode;
                    Node newNode = new Node(newData);
                    while(current != null) {
                        if(current.getNextNode().getData() == nextData) {
                            break;
                        }
                        current = current.getNextNode();
                    }
                    if(current == null) {
                        throw new NullPointerException("There is no element node containing " + nextData);
                    } else {
                        newNode.setNextNode(current.getNextNode());
                        current.setNextNode(newNode);
                    }
                }
            }
        }
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
    
    /**
    * Method to delete tail node
    * @throws NullPointerException if linked list is empty
    **/
    public void delete() 
    {
        Node current = this.headerNode;
        if(this.isEmpty()) {
            throw new NullPointerException("No such element nodes to be deleted in this linked list");
        } else if(current.getNextNode() == null) {
            this.headerNode = null;
        } else {
            while(current != null) {
                if(current.getNextNode().getNextNode() == null) {
                    break;
                }
                current = current.getNextNode();
            }
            current.setNextNode(null);
        }
    }
    
    /**
    * Method to delete specific data node in linked list
    * @param data data to be deleted
    * @throws NullPointerException if there is no specific data or linked list is empty
    **/
    public void deleteNode(T data) 
    {
        if(this.isEmpty()) {
            throw new NullPointerException("linked list is empty");
        } else if(this.headerNode.getData() == data) {
            this.headerNode = this.headerNode.getNextNode();
        } else {
            if(this.headerNode.getNextNode() == null) {
                throw new NullPointerException("There is no element node containing " + data);
            } else {
                Node current = this.headerNode;
                while(current != null) {
                    if(current.getNextNode() == null || current.getNextNode().getData() == data) {
                        break;
                    }
                    current = current.getNextNode();
                }
                if(current.getNextNode() == null) {
                    throw new NullPointerException("There is no element node containing " + data);
                } else {
                    current.setNextNode(current.getNextNode().getNextNode());
                }
            }
        }
    }
}