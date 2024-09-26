package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LinkedList1DTest {

    public LinkedList1D sll;

    @BeforeAll
    public void init(){
        sll =new LinkedList1D();
    }

    @Test
    @Order(1)
    public void addNodeTest1(){
        sll.addNodeAtEnd(20);
        sll.addNodeAtFirst(15);
        sll.addNodeAtEnd(40);
        sll.addNodeAtFirst(10);
        sll.addNodeAtEnd(45);
        sll.addNodeAtFirst(05);
    }

    /*@Test
    @Order(2)
    public void addNodeAtFirstTest2(){
        sll.addNodeAtFirst(15);
        sll.addNodeAtFirst(10);
        sll.addNodeAtFirst(05);
    }
*/

    @Test
    @Order(3)
    public void displayNodesTest(){
        sll.displayNodes();
    }

    @Test
    @Order(4)
    public void getCountTest(){
        int actuCount=sll.getCount();
         assertEquals(6,actuCount);
         System.out.println("Node Count is "+actuCount);
    }
}
