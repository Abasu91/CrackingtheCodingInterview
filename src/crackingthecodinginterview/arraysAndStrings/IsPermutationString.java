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
 */
public class IsPermutationString {
    public static boolean isPermutation(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        return sort(s1).equals(sort(s2));
            
        }
      
     public static String sort(String content){
        char [] ch =content.toCharArray();
        java.util.Arrays.sort(ch);
        return new String(ch);
    }
     
     public static ArrayList<String> NumberOfPerms(String word){
        int lastPosition = word.length() -1;
        //String lastPart = word.substring(lastPosition);
        ArrayList<String> list = new ArrayList<>();
        //String restOfString = word.substring(0, lastPosition);
        //System.out.println("String length is "+word.length());
        if(word.length() ==1){
           list.add(word);
        }
        else{
             String lastPart = word.substring(lastPosition);
             String restOfString = word.substring(0, lastPosition);
             list = merge(NumberOfPerms(restOfString), lastPart);
            
        }
        
        return list;
        
    }

    private static ArrayList<String> merge(ArrayList<String> list, String c) {
        
        ArrayList<String> newlist = new ArrayList<>();
        for(String s:list){
            //for every string in thr previous arraylist
            for(int i=0;i<=s.length();i++){
                String sbuf = new StringBuffer(s).insert(i, c).toString();
                newlist.add(sbuf);
           }
        }
        return newlist;
    }
    
    private static void printList(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Total number of permutations is "+list.size());
    }
     
    public static void main(String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the String1");
        String parentString = sc.nextLine();
        System.out.println("Enter the String2");
        String secondString = sc.nextLine();
        System.out.println("Strings are permutation of each other :"+isPermutation(parentString,secondString));
        System.out.println("Possible Permutaions of Parent String are ");
        printList(NumberOfPerms(parentString));
       
    
    }
    
   
}
