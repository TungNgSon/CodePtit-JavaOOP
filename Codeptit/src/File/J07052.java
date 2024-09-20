/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
class ThiSinh implements Comparable<ThiSinh>
{
    private String id,name;
    private double math,phys,chem;
    private String state;
    ThiSinh(String id,String name,double math,double phys,double chem)
    {
        this.id=id;
        this.name=norN(name);
        this.math=math;
        this.phys=phys;
        this.chem=chem;
    }
    public String norN(String name)
    {
        String res="";
        String a[]=name.trim().split("\\s+");
        for(String x:a)
        {
            res+=x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        res=res.trim();
        return res;
    }
    public void setState(String s)
    {
        this.state=s;
    }
    public double getBonus()
    {
        char c=id.charAt(2);
        if(c=='1')
        {
            return 0.5;
        }
        else{
            if(c=='2')
            {
                return 1.0;
            }
            else
            {
                return 2.5;
            }
        }
    }
    public double getTotal()
    {
        return math*2+phys+chem+getBonus();
    }
    public String format(double number) {
       
        if (number == (int) number) {
            return String.valueOf((int) number);
        } else {
            
            return String.format("%.1f", number);
        }
    }
    @Override public String toString()
    {
       
        return id+" "+name+" "+format(this.getBonus())+" "+format(this.getTotal())+" "+state;
    }
    @Override public int compareTo(ThiSinh ts)
    {
        if(ts.getTotal()==this.getTotal())
        {
            return this.id.compareTo(ts.id);
        }
        return Double.compare(ts.getTotal(), this.getTotal());
    }
}
public class J07052 {
    public static void main(String[] args) throws IOException
    {
        Scanner inp=new Scanner(new File("THISINH.in"));
        int n=inp.nextInt();
        ThiSinh ts[]=new ThiSinh[n];
        for(int i=0;i<n;i++)
        {
            inp.nextLine();
            ts[i]=new ThiSinh(inp.nextLine(),inp.nextLine(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble());
        }
        Arrays.sort(ts);
        int k=inp.nextInt();
        double stan=ts[k-1].getTotal();
        System.out.println(String.format("%.1f", stan));
        
        for(ThiSinh x:ts)
        {
            if(x.getTotal()>=stan)
            {
                x.setState("TRUNG TUYEN");
            }
            else
            {
                x.setState("TRUOT");
            }
            System.out.println(x);
        }
    }
}