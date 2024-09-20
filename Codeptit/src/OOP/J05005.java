/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.*;
import java.text.*;
class SinhVien implements Comparable<SinhVien>
{
    private String id,name,idc,dob;
    private double gpa;
    public SinhVien(int i, String name, String idc,String dob,double gpa)
    {
        this.id=String.format("B20DCCN%03d", i);
        this.name=norN(name);
        this.idc=idc;
        this.dob=dob;
        this.gpa=gpa;
    }
    public String norN(String name)
    {
        String a[]=name.trim().split("\\s+");
        String res="";
        for(String x:a)
        {
            res+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }
    public double getGpa()
    {
        return this.gpa;
    }
    public String toString()
    {
        return id+" "+name+" "+idc+" "+dob+" "+String.format("%.2f", gpa);
    }
    @Override public int compareTo(SinhVien sv)
    {
        return Double.compare(sv.getGpa(), this.getGpa());
    }
}
public class J05005 {
    public static void main(String[] args) throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        SinhVien sv[]=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            String name=sc.nextLine();
            String idc=sc.nextLine();
            String dob=sc.nextLine();
            double gpa=sc.nextDouble();
            Date date=sdf.parse(dob);
            sv[i]=new SinhVien(i+1,name,idc,sdf.format(date),gpa);
            
        }
        Arrays.sort(sv);
        for(SinhVien x:sv)
        {
            System.out.println(x);
        }
    }
    
}

