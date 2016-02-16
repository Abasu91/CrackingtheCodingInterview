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
public class Node extends ListItem {
    Node(Object value){
        super(value);
    }

    @Override
    public ListItem next() {
        return this.rightLink;
    }

    @Override
    public ListItem previous() {
       return this.leftLink;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.rightLink = item;
        return this.rightLink;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
       this.leftLink = item;
       return this.leftLink;
    }

    @Override
    public int compareTo(ListItem item) {
        if(item!=null){
            return ((String) super.getValue()).compareTo((String) item.getValue());
        }
        else{
            return  -1;
        }
    }
    
}
