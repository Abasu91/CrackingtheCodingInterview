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
public class MyLinkedList implements NodeList {

    ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newitem) {
        //If LinkedList is empty
        if (this.root == null) {
            //Make newitem the first and let root point it
            this.root = newitem;
            return true;
        }

        ListItem currentItem = this.root;

        //Loop until end of linkedlist which is null offcourse
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newitem);
            //Need to move right
            if (comparison < 0) {
                //Can move to the right, not end of list
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } //End of List reached
                else {
                    currentItem.setNext(newitem);
                    newitem.setPrevious(newitem);
                    return true;
                }

            } else if (comparison > 0) {
                //Can move to the left, not the root
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newitem);
                    newitem.setPrevious(currentItem.previous());
                    newitem.setNext(currentItem);
                    currentItem.setPrevious(newitem);
                }
                //Reached the root/head of the list
                else{
                     newitem.setNext(this.root);
                     this.root.setPrevious(newitem);
                     this.root = newitem;
                }
                return true;
            }
            
            else if(comparison == 0){
                System.out.println("Cannot be added, already there : "+newitem.getValue());
                return false;
            }
            
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
       if(item!= null){
        System.out.println("Deleting item "+item.getValue());
        
        ListItem currentItem = this.root;
        while(currentItem !=null){
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                //If root is reached
                if(currentItem == this.root){
                    this.root = currentItem.next();
                }
                //Item Found
                else{
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next()!=null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
                
            }
            // Item is not reached, move right
            else if(comparison<0){
                currentItem = currentItem.next();
            }
            //Item is not in the list
            else{
                return false;
            }
        }
    }
       return false;
    }

    @Override
    public void traverse(ListItem root) {
       if(root == null){
           System.out.println("List is empty");
       }
       else{
           while(root!=null){
               System.out.println(root.getValue());
               root =root.next();
           }
       }
    }

}
