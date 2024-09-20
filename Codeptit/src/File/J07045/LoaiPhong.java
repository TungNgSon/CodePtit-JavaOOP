/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07045;

/**
 *
 * @author Moment
 */
import java.util.*;
public class LoaiPhong implements Comparable<LoaiPhong>
{
    private String sign,name;
    private int cost;
    private double fee;
    public LoaiPhong(String s)
    {
       String a[]=s.trim().split("\\s+");
       this.sign=a[0];
       this.name=a[1];
       this.cost=Integer.parseInt(a[2]);
       this.fee=Double.parseDouble(a[3]);
    }
    public String getName()
    {
        return this.name;
    }
    @Override
    public String toString()
    {
        return sign+" "+name+" "+cost+" "+fee;
    }
    @Override
    public int compareTo(LoaiPhong r)
    {
        return name.compareTo(r.getName());
    }
    
}
