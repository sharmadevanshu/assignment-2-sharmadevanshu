/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {public static void main(String[] args) {
    MyBinarySearchTree obj = new MyBinarySearchTree();
    obj.insert(4);
    obj.insert(15);
    obj.insert(63);
    obj.insert(7);
    obj.insert(2);
    obj.insert(45);
    obj.insert(78);
    obj.preVSpost();
}
}
