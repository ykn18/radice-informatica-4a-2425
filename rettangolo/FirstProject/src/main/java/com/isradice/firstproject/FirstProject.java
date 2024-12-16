/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.isradice.firstproject;

/**
 *
 * @author ykn18
 */
public class FirstProject {
    
    public static void main(String[] args) {
         Rectangle  r1 = new Rectangle(10, 5);
         System.out.println(r1.getPerimeter());
         
         Rectangle r2 = new Rectangle(10, 2);
         System.out.println("La differenza tra le aree vale: " + (r1.getArea()-r2.getArea()));
    }
}
