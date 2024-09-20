/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
import java.text.*;
class CaThi implements Comparable<CaThi>
{
 
    private String id,day,time,room;
    public CaThi(int i,String day,String time,String room)
    {
        this.id="C"+String.format("%03d",i);
        this.day=day;
        this.time=time;
        this.room=room;
    }
    public long getDay() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sdf.parse(day);
        return date.getTime()/(24*60*60*1000);
        
    }
    public long getTIME() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        Date date=sdf.parse(time);
        return date.getTime();
    }
    public String getId()
    {
        return this.id;
    }
    @Override public String toString()
    {
        return id+" "+day+" "+time+" "+room;
    }
    @Override public int compareTo(CaThi ct)  
            
    {
        try
        {
        if(this.getDay()!=ct.getDay())
        {
            return Long.compare(this.getDay(), ct.getDay());
        }
        if(this.getTIME()!=ct.getTIME())
        {
            return Long.compare(this.getTIME(), ct.getTIME());
        }
        return this.id.compareTo(ct.getId());
        }
        catch(ParseException e)
        {
            
        }
        return this.id.compareTo(ct.getId());
    }
}
public class J07059 {
    public static void main(String[] args) throws IOException,ParseException
    {
        Scanner inp=new Scanner(new File("CATHI.in"));
        int n=inp.nextInt();
        inp.nextLine();
        CaThi ct[]=new CaThi[n];
        for(int i=0;i<n;i++)
        {
            ct[i]=new CaThi(i+1,inp.nextLine(),inp.nextLine(),inp.nextLine());
        }
        Arrays.sort(ct);
        for(CaThi x:ct)
        {
            System.out.println(x);
        }
    }
}
