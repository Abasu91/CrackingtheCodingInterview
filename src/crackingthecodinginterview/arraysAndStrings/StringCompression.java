/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.arraysAndStrings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Arijit
 */
public class StringCompression {
    private static HashMap<Character,Integer> compressString(String word){
        int count = 0;
        int k ;
        HashMap<Character, Integer> hmap = new HashMap<>();
        char ch[] = word.toCharArray();
        for(char c:ch){
            if(word.indexOf(c) == word.lastIndexOf(c)){
                hmap.put(c,1);
            }
            else if (word.indexOf(c) != word.lastIndexOf(c)){
                if(!hmap.containsKey(c)){
                    hmap.put(c,++count);
                }
                else if(hmap.containsKey(c)){
                    //Get value corresponding to key
                    k = hmap.get(c);
                    hmap.put(c, ++k);
                }
                
                }
            }
        
        return hmap;
        
    }
    
    private  static void convertHmap(HashMap<Character, Integer> hmap){
        
        StringBuffer br = new StringBuffer();
        for(char s:hmap.keySet()){
            br.append(s+ ""+ hmap.get(s));
        }
        System.out.println(br.toString());
    }
    
    private static boolean same(Character a , Character b){
        return a.equals(b);
    }
    
    
    public static void main(String c[]){
        System.out.println("Enter the String ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String input = sc.nextLine();
        //System.out.println(compressString(input));
        convertHmap(compressString(input));
    }
    
}
