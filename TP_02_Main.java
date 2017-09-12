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
public class Main {
    public static void main(String[] args) {
        		Student s1 = new Student("Max",321033,true,3.7);
        		Student s2 = new Student("Anny",23381,true);
        		Student s3 = new Student("Bobby",22122);
        		System.out.println("Student 1");
        		s1.display();
        		System.out.println("Student 2");
        		s2.display();
        		System.out.println("Student 3");
        		s3.display();
    		}

}
