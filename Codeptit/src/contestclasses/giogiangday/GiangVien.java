/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses.giogiangday;

/**
 *
 * @author Moment
 */
public class GiangVien {
    private String id,name;
    private double teachTime;
    public GiangVien(String id,String name)
    {
        this.id=id;
        this.name=name;
        teachTime=0;
    }
    public String getId()
    {
        return this.id;
    }
    public void addTime(double amount)
    {
        this.teachTime+=amount;
    }
    public String toString()
    {
        return name+" "+String.format("%.2f", this.teachTime);
    }
}
