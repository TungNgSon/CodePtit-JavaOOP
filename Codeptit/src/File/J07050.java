/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
class MatHang implements Comparable<MatHang>
{
    private String id, name, group;
    private double buy,sold,profit;
    public MatHang(int i, String name,String group,double buy,double sold)
    {
        this.id="MH"+String.format("%02d", i);
        this.name=name;
        this.group=group;
        this.profit=sold-buy;
    }
    public double getPro()
    {
        return this.profit;
    }
    @Override public String toString()
    {
        return id+" "+name+" "+group+" "+String.format("%.2f", profit);
    }
    @Override public int compareTo(MatHang mh)
    {
        return Double.compare(mh.getPro(), this.profit);
    }
    
}
public class J07050 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("MATHANG.in"));
        int n=inp.nextInt();
        MatHang mh[]=new MatHang[n];
        for(int i=0;i<n;i++)
        {
            inp.nextLine();
            mh[i]=new MatHang(i+1,inp.nextLine(),inp.nextLine(),inp.nextDouble(),inp.nextDouble());
        }
        Arrays.sort(mh);
        for(MatHang x:mh)
        {
            System.out.println(x);
        }
    }
    
}
