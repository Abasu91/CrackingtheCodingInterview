/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Arijit
 */
public class LinkedListDemo {
    public static void main(String args[]){
        MyLinkedList list = new MyLinkedList(null);
        String data = "5 4 1 6 7 0 2";
        String arrayData[] = data.split(" ");
        for(String s:arrayData){
            list.addItem(new Node(s));
        }
        
        list.traverse(list.getRoot());
        list.removeItem(new Node("4"));
        list.traverse(list.getRoot());
        
        list.removeItem(new Node("1"));
        list.traverse(list.getRoot());
        
    }
    
}
