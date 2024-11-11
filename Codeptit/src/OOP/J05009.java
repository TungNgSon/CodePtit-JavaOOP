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
import java.io.*;
class SinhVien implements Comparable<SinhVien>
{
    private String name,dob,id;
    private double a,b,c;
    public SinhVien(String id,String name,String dob,double a,double b,double c)
    {
        this.id=id;
        this.name=name;
        this.dob=dob;
        this.a=a;
        this.b=b;
        this.c=c;
        
    }
    public double getTotal()
    {
        return a+b+c;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+dob+" "+getTotal();
    }
    @Override
    public int compareTo(SinhVien sv)
    {
        return Double.compare(this.getTotal(),sv.getTotal());
    }
}
public class J05009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SinhVien sv[]=new SinhVien[n]; 
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            sv[i]=new SinhVien(Integer.toString(i+1),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(sv);
        double score=sv[n-1].getTotal();
        for(SinhVien x:sv)
        {
            if(x.getTotal()==score)
            {
                System.out.println(x);
            }
        }
    }
    
}
//3
//Nguyen Van A
//12/12/1994
//3,5
//7,0
//5,5
//Nguyen Van B
//1/9/1994
//7,5
//9,5
//9,5
//Nguyen Van C
//6/7/1994
//8,5
//9,5
//8,5
