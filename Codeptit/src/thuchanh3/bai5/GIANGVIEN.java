/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai5;

/**
 *
 * @author Moment
 */
public class GIANGVIEN {
    private String id,name;
    private double totalTime;

    public GIANGVIEN(String id, String name) {
        this.id = id;
        this.name = name;
        totalTime=0;
    }
    public void addTime(double time)
    {
        this.totalTime+=time;
    }
    public String toString()
    {
        return this.name+" "+String.format("%.2f",this.totalTime);
    }

    public String getId() {
        return id;
    }
}
