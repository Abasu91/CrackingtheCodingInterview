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
public class Student {
    
    private int StudentId;
    private String StudentName;
    private static  ArrayList<Student> ar = new ArrayList<>();

    public Student(int StudentId, String StudentName) {
        this.StudentId = StudentId;
        this.StudentName = StudentName;
    }
    
    public Student(){
        
    }

    public static ArrayList<Student> getAr() {
        return ar;
    }

    public int getStudentId() {
        return StudentId;
    }

    public void setStudentId(int StudentId) {
        this.StudentId = StudentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    
    public static  ArrayList<Student> addStudentIntoArray(String name, int id){
        boolean result = findStudent(id);
        if(result){
       
          ar.add(new Student(id,name));  
        
        }
        
        return ar;
    }
    
    private static boolean findStudent(int id){
        for(int i =0;i<ar.size();i++){
            if(ar.get(i).getStudentId() == id ){
                return false;
            }
            
        }
        return true;
    }
    
}
