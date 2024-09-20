/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;
import java.util.*;
class Time implements Comparable<Time>
{
    private int h,m,s;
    public Time(int h,int m,int s)
    {
        this.h=h;
        this.m=m;
        this.s=s;
        
    }
    public int getH()
    {
        return this.h;
    }
    public int getM()
    {
        return this.m;
    }
    public int getS()
    {
        return this.s;
    }
    @Override
    public int compareTo(Time t)
    {
        int t1=this.h*3600+this.m*60+this.s;
        int t2=t.getH()*3600+t.getM()*60+t.getS();
        return t1-t2;
    }
    @Override
    public String toString()
    {
        return Integer.toString(h)+" "+Integer.toString(m)+" "+Integer.toString(s);
    }
    
}

public class J05033 {
    public static void main(String[] args) {
         Scanner inp=new Scanner(System.in);
    int n=inp.nextInt();
    Time[] a =new Time[n];
    for(int i=0;i<n;i++)
    {
        Time t=new Time(inp.nextInt(),inp.nextInt(),inp.nextInt());
        a[i]=t;
    }
    Arrays.sort(a);
    for(Time x:a)
    {
        System.out.println(x);
    }
    }
    
}
