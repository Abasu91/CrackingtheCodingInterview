/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.arraysAndStrings;

/**
 *
 * @author Arijit
 */
public  class reverseString {
    public static String reverse(String word ){
        String reverseWord = "";
        for(int i=word.length()-1;i>=0;i--){
            reverseWord+=word.charAt(i);
            
        }
        return reverseWord;
    }
    
    public static void main(String x[]){
        System.out.println("Enter the String");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(reverse(sc.nextLine()));
        
    }
    
}
