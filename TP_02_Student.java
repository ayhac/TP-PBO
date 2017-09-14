/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author DELL
 */
public class Student {
    private String name;
    private long studentId;
    private boolean isMale = true;
    private double grade;
   
     public void getStudentId(long studentId) {
 
//        int count = 0;
//        while (studentId > 0) {
//            studentId = studentId/10;
//            count++;
//        }
//        if (count == 6) {
//            this.studentId = studentId;
//        }else{
//            this.studentId = -1;
//        }
            if ((studentId>99999)&&(studentId<1000000)){
         this.studentId = studentId;
     }
            else{
                    this.studentId = -1;
                    }
    }
    Student(String name,long studentId, boolean isMale, double grade) {
        this.name = name;
        getStudentId(studentId);
        this.isMale = isMale;
        this.grade = grade;
    }
   Student(String name, long studentId, boolean isMale) {
        this.name = name;
        this.studentId = studentId;
        getStudentId(studentId);
        this.isMale = isMale;
        
    }
    
   Student(String name, long studentId) {
        this.name = name;
        this.studentId = studentId; 
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        
        if (name == "") {
            this.name = "empty";
    } else {
            this.name = name;
        }
    }

    /**
     * @return the studentId
     */
   

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(long studentId) {
        getStudentId(studentId);
    }

    /**
     * @return the isMale
     */
    public boolean isIsMale() {
        return isMale;
    }

    /**
     * @param isMale the isMale to set
     */
    public void setIsMale(boolean isMale) {
        this.isMale = isMale;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }
    
    public void display() {
        System.out.println("Name: "+name);
        System.out.println("StudentID: "+studentId);
        if(isMale) {
            System.out.println("Sex: Male");
        } else {
            System.out.println("Sex: Female");
        }
        System.out.println("Grade: "+grade);
    }

    
}
