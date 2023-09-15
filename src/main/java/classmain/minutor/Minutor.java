/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package classmain.minutor;

import classmain.MinutorFrame.MinutorFrame;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author fillo
 */
public class Minutor {
    // CONTRAINTES 
    
    // Attributs 
    private int year;
    private int month;
    private int minute;
    private int second;
    
    // Constructeur
    public Minutor(int year, int month, int minute, int second){
        this.year = year;
        this.month = month;
        this.minute = minute;
        this.second = second;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setYear(int year) {
       this.year = year;
    }
    
    public int getMounth(){
        return month;
    }
    
    public void setMounth(int month){
        this.month = month;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public void setMinute(int minutes){
        this.minute = minute;
    }
    
    public int getSecond(){
        return second;
    }
    
    public void setSecond(int second){
        this.second = second;
    }
    
    // methode qui retourne la totalité des attributs de la classe
    public String toString(){
        return "year(s) : " + year + "month(s) : " + month + "minute(s) : " + minute + "second(s) : " + second;
    }
   
 
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MinutorFrame minutorFrame = new MinutorFrame();
                minutorFrame.setVisible(true);
            }
        });
    }
}