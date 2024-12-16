/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.isradice.firstproject;

/**
 *
 * @author ykn18
 */
public class Rectangle {
    private int base;
    private int height;
    
    public Rectangle(){
    }
    
    public Rectangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    
    public int getBase(){
        return base;
    }

    public int getHeight() {
        return height;
    }
    
    public void setBase(int base){
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getPerimeter(){
        return (base + height) * 2;
    }
    
    public int getArea(){
        return base * height;
    }
}
