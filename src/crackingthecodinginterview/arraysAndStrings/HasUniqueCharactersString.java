/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.arraysAndStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Arijit
 */
public class HasUniqueCharactersString {
    public static boolean hasUniqueChars(String word){
                char[] ch =word.toCharArray();
                boolean isUnique = false;
                for(char character:ch){
                    if(word.indexOf(character) == word.lastIndexOf(character)){
                        isUnique = true;
                        //System.out.println("First non repeating character is "+character);
                        //break;
                    }
                    else{
                        isUnique = false;
                        System.out.println("First repeating char is "+character);
                        break;
                    }
                   
                }
                return isUnique;
            }
    public static  void main(String x[]){
        System.out.println("Enter the String");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(hasUniqueChars(sc.nextLine()));
    }
}
        
    
    

