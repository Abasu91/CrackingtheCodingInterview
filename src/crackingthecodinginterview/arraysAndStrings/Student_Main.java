/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crackingthecodinginterview.arraysAndStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Arijit
 */
public class Student_Main {
    public static HashMap<Integer, Student> buildMap(ArrayList<Student> students){
        HashMap<Integer, Student> map = new HashMap<>();
        for(Student s:students ){
            map.put(s.getStudentId(), s);
        }
        
        return map;
        
    }
    
    public static void printHashMap(HashMap<Integer, Student> map){
        Set set = map.entrySet();
        java.util.Iterator ir = set.iterator();
        
        while(ir.hasNext()){
             Map.Entry mentry = (Map.Entry)ir.next();
             System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
             System.out.println(mentry.getValue());
        }
        
        
    }
    
    public static void main(String args[]){
        Student student = new Student();
        student.addStudentIntoArray("Arijit",2790624);
        student.addStudentIntoArray("Rex", 2790625);
        printHashMap(buildMap(Student.getAr()));
        
        
        
        
    }
    
}
