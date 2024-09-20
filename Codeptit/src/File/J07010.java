/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
class SinhVien
{
    private String name, id, idc, birth;
    private double gpa;
    public SinhVien(int id, String name,String idc, String birth, double gpa)
    {
        this.id="B20DCCN"+String.format("%03d", id);
        this.name=name;
        this.idc=idc;
        this.birth=birth;
        this.gpa=gpa;
    }
    public void normalize()
    {
        String a[]=birth.split("/");
        String res="";
        res=res+String.format("%02d", Integer.parseInt(a[0]))+"/";
        res=res+String.format("%02d", Integer.parseInt(a[1]))+"/";
        res=res+String.format("%04d", Integer.parseInt(a[2]));
        birth=res;
        return;
        
    }
    @Override
    public String toString()
    {
        normalize();
        return id+" "+name+" "+idc+" "+birth+" "+String.format("%.2f", gpa);
    }
    
}
public class J07010 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        
    
    Scanner inp=new Scanner(new File("SV.in"));
    int n=inp.nextInt();
    SinhVien sv[]=new SinhVien[n];
    for(int i=0;i<n;i++)
    {
        inp.nextLine();
        sv[i]=new SinhVien(i+1,inp.nextLine(),inp.next(),inp.next(),inp.nextDouble());
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(sv[i]);
    }
        
    }
}