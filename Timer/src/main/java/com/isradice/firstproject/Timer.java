package com.isradice.firstproject;

import java.util.concurrent.TimeUnit;
/**
 *
 * @author ykn18
 */
public class Timer {
    private String name;
    private int totalTime;
    
    public Timer(){
        name = "Default timer";
        totalTime = 10;
    }
    
    public Timer(int time){
        name = "Default timer";
        totalTime = time;
    }
    
    public Timer(String name, int time){
        this.name = name;
        totalTime = time;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void start(){
        for(int i = totalTime; i >= 0; i--){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Remaining time for timer " + this.name + " is: " + i);
        }
    }
}
