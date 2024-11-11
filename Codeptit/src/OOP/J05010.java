/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Moment
 */
import java.util.*;
class MatHang implements Comparable<MatHang>
{
    private String id,name,model;
    private double buy,sold;
    public MatHang(String id,String name,String model,double buy,double sold)
    {
        this.id=id;
        this.name=name;
        this.model=model;
        this.buy=buy;
        this.sold=sold;
        
    }
    public double getPro()
    {
        return this.sold-this.buy;
    }
    public String toString()
    {
        return this.id+" "+this.name+" "+this.model+" "+String.format("%.2f", this.getPro());
    }
    @Override public int compareTo(MatHang mh)
    {
        return Double.compare(mh.getPro(), this.getPro());
    }
}
public class J05010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        MatHang mh[]=new MatHang[n];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            mh[i]=new MatHang(Integer.toString(i+1),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(mh);
        for(MatHang x:mh)
        {
            System.out.println(x);
        }
    }
}
//3
//May tinh SONY VAIO
//Dien tu
//16400
//17699
//Tu lanh Side by Side
//Dien lanh
//18300
//25999
//Banh Chocopie
//Tieu dung
//27,5
//37