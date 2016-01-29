/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.arraysAndStrings;

import java.util.ArrayList;

/**
 *
 * @author Arijit
 * This method does not use a character array as suggested
 */
public class ReplaceSpace {
    
    
    private String replaceSpace(String word){
        String sbuf = null;
        if(!word.contains(" ")){
            return "No space";
        }
        else{
              for(int i=0;i<word.length();i++){
                  if(word.substring(i,i+1).equals(" ")){
                     sbuf = word.replace(word.substring(i,i+1),"%20");
                      
                  }
               }
               return sbuf;
            }
     }
    
    public static void main(String x[]){
        System.out.println("Enter the string");
        java.util.Scanner sc =new java.util.Scanner(System.in);
        ReplaceSpace rs = new ReplaceSpace();
        System.out.println(rs.replaceSpace(sc.nextLine()));
        
    }
    
}
