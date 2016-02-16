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
public interface NodeList {
    public ListItem getRoot();
    public boolean addItem(ListItem item);
    public boolean removeItem(ListItem item);
    public void traverse(ListItem root);
    
    
}
