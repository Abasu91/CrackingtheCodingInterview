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
public class StringCompressionPart2 {
    
  public static String compressString(String word){
      char ch[] = word.toCharArray();
      char previous = ch[0];
      int count =1;
      StringBuilder br = new StringBuilder();
      for(int i=1;i<ch.length;i++){
          char current = ch[i];
          if(current == previous){
              count++;
          }
          else{
              br.append(previous).append(count);
              count =1;
          }
          previous = current;
      }
      return br.append(previous).append(count).toString();
  }
    
    public static void main(String h[]){
        System.out.println("Enter the String");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println(compressString(sc.nextLine()));
        
    }
}
