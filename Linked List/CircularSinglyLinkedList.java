/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author N1no51
 */
public class CircularSinglyLinkedList<T>
{
    private Node headerNode;
    private Node tailNode;
    
    public CircularSinglyLinkedList()
    {
        this.headerNode = null;
        this.tailNode = null;
    }
    
    public boolean isEmpty()
    {
        return this.headerNode == null && this.tailNode == null;
    }
    
    public void makeEmpty()
    {
        this.headerNode = null;
        this.tailNode = null;
    }
    
    public void printHeaderNode()
    {
        if(!this.isEmpty()) {
            System.out.println(this.headerNode.getData());
        } else {
            throw new NullPointerException("There is no header node to be printed in this linked list");
        }
    }
    
    public void printTailNode()
    {
        if(!this.isEmpty()) {
            System.out.println(this.tailNode.getData());
        } else {
            throw new NullPointerException("There is no tail node to be printed in this linked list");
        }
    }
    
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
    
    public void insert(T data) 
    {
        Node current = this.headerNode;
        Node newNode = new Node(data);
        if(current == null) {
            this.headerNode = newNode;
            this.tailNode = newNode;
            this.headerNode.setNextNode(this.tailNode);
            this.tailNode.setNextNode(this.headerNode);
        } else {
            while(current.getNextNode() != this.headerNode) {
                current = current.getNextNode();
            }
            this.tailNode = newNode;
            current.setNextNode(newNode);
            newNode.setNextNode(this.headerNode);
        }
    }
}
