/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:08 PM
 */
package problem4.main;

import problem1.mybst.MyBinarySearchTree;
import problem4.myqueue.MyQueue;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {public static void main(String[] args) {
    MyBinarySearchTree obj = new MyBinarySearchTree();
    obj.insert(4);
    obj.insert(5);
    obj.insert(2);
    obj.insert(17);
    obj.insert(34);
    obj.insert(12);
    obj.insert(70);

    MyQueue mq = new MyQueue();
    mq.preSuccessor(obj.getroot());
    mq.getPreSucc();
}
}
