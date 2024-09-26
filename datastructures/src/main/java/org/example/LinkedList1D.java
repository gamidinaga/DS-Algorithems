/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;


/**
 *   Singly Linked list Operations addAtEnd, displayNodes, getCount, addAtFirst
 *   SLL can be traverse in one direction which is Forward or Backward (Head to Tail or in reverse)
 * */
public class LinkedList1D {
    /**
     * count variable holds the no of nodes added in linked list
     * */
    public int count = 1;
    private Node head;

    /**
      * addNodeAtEnd Operation in Linked List
       @param value is int parameter
     */
    public void addNodeAtEnd(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            System.out.println(count + "Node added in list");
            //count++;
        } else {
            count++;
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
                System.out.println(count + "Node added in list in while loop");
            }
            temp.next = newNode;
            System.out.println(count + "Node added in list");
        }
    }

    /**
      addNodeAtFirst Operation in Linked List
      @param value is int parameter
     */
    public void addNodeAtFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            System.out.println(count + "Node added first in the list");
            //count++;
        } else {
            count++;
            Node temp = newNode;
            /*while (temp.next != null) {
                temp = temp.next;
                System.out.println(count + "Node added first in list in while loop");
            }*/

            temp.next = head;
            head=temp;
            System.out.println(count + "Node added first in list");
        }
    }


    /**
      To display all the nodes added in LinkedList
     */
    public void displayNodes() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value + "->");
            temp = temp.next;
        }
    }

    /**
    To get the count of nodes added in the LinkedList
     @return count
    */
    public int getCount() {
        return count;
    }

    /**
     * Node Static class is used to Link the Nodes.
     * */
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }


}