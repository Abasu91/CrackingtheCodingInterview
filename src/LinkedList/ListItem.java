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
public abstract class ListItem {
    protected ListItem rightLink = null;
    protected ListItem leftLink  = null;
    
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
    
    protected Object value;
    
    ListItem(Object value){
        this.value = value;
    }
    
    public abstract ListItem next();
    public abstract ListItem previous();
    public abstract ListItem setNext(ListItem item);
    public abstract ListItem setPrevious(ListItem item);
    public abstract int compareTo(ListItem item);
    
}
