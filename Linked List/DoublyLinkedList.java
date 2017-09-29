/** 
* This class implements a Doubly Linked List Data Structure and Its Supporting Methods
* A Linked List only contains header node as its first controller
*
* @author Dennis Pratama Kamah 
* @version 2017.09.03
 * @param <T>
**/
public class DoublyLinkedList<T>
{
    private DynamicNode headerNode;
    /**
    * Default Constructor Doubly LinkedList 
    * Initial header node is null
    **/
    public DoublyLinkedList() 
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
    public void forwardPrintAll()
    {
        if(!this.isEmpty()) {
            DynamicNode current = this.headerNode;
            while(current != null) {
                System.out.println(current.getData());
                current = current.getNextNode();
            }
        } else {
            throw new NullPointerException("No such element nodes to be printed in this linked list");
        }
    }
    
    /**
    * Method to print all data in each node in linked list 
    * starting from tail node
    * @throws NullPointerException if linked list is empty
    **/
    public void backwardPrintAll()
    {
        if(!this.isEmpty()) {
            DynamicNode current = this.headerNode;
            while(current.getNextNode() != null) {
                current = current.getNextNode();
            }
            while(current != null) {
                System.out.println(current.getData());
                current = current.getPreviousNode();
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
       DynamicNode newNode = new DynamicNode(data);
       DynamicNode oldNode = this.headerNode;
       newNode.setNextNode(oldNode);
       if(oldNode != null) {
           oldNode.setPreviousNode(newNode);
       }
       this.headerNode = newNode;
    }
    
     /**
    * Method to insert new node as tail
    * @param data a generic-typed data
    **/
    public void insert(T data) 
    {
        DynamicNode current = this.headerNode;
        DynamicNode newNode = new DynamicNode(data);
        if(current == null) {
            this.headerNode = newNode;
        } else {
            while(current.getNextNode() != null) {
                current = current.getNextNode();
            }
            current.setNextNode(newNode);
            newNode.setPreviousNode(current);
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
            if(this.headerNode.getNextNode() == null) {
                this.headerNode = null;
            } else {
                this.headerNode = this.headerNode.getNextNode();
                this.headerNode.setPreviousNode(null); 
            }
        }
    }
    
    /**
    * Method to delete tail node
    * @throws NullPointerException if linked list is empty
    **/
    public void delete() 
    {
        DynamicNode current = this.headerNode;
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
            this.headerNode.getNextNode().setPreviousNode(null);
            this.headerNode = this.headerNode.getNextNode();
        } else {
            if(this.headerNode.getNextNode() == null) {
                throw new NullPointerException("There is no element node containing " + data);
            } else {
                DynamicNode current = this.headerNode;
                while(current != null) {
                    if(current.getNextNode() == null || current.getNextNode().getData() == data) {
                        break;
                    }
                    current = current.getNextNode();
                }
                if(current.getNextNode() == null) {
                    throw new NullPointerException("There is no element node containing " + data);
                } else {
                    if(current.getNextNode().getNextNode() == null) {
                        current.setNextNode(null);
                    } else {
                        current.setNextNode(current.getNextNode().getNextNode());
                        current.getNextNode().setPreviousNode(current);
                    }  
                }
            }
        }
    }
}
