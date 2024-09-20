/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07051;

import java.text.*;
import java.util.*;

public class KHACHHANG implements Comparable<KHACHHANG>
{
    private String id,name,room,first,last;
    private int fee;
    private long totalCost,dur;
    public String norD(String s)
    {
        String res="";
        String a[]=s.split("/");
        res+=String.format("%02d", Integer.parseInt(a[0]))+"/";
        res+=String.format("%02d", Integer.parseInt(a[1]))+"/";
        res+=String.format("%04d", Integer.parseInt(a[2]));
        return res;
    }
    public String norN(String name)
    {
        String res="";
        String a[]=name.trim().split("\\s+");
        for(String x:a)
        {
            res+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        res=res.trim();
        return res;
        
    }
    public long getCost() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date ftime=sdf.parse(first);
        Date ltime=sdf.parse(last);
        long dur=(ltime.getTime()/(24*60*60*1000))-(ftime.getTime()/(24*60*60*1000))+1;
        int a[] = {25, 34, 50, 80};
        int lv=Integer.parseInt(this.room.substring(0,1))-1;
        return dur*a[lv] + fee;
        
        
    }
    public void setDur() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date ftime=sdf.parse(first);
        Date ltime=sdf.parse(last);
        long dur=(ltime.getTime()/(24*60*60*1000))-(ftime.getTime()/(24*60*60*1000))+1;
        this.dur=dur;
    }
    public KHACHHANG(int i,String name,String room, String first,String last,int fee) throws ParseException
    {
        this.id="KH"+String.format("%02d", i);
        this.name=this.norN(name);
        this.room=room;
        this.fee=fee;
        this.first=this.norD(first);
        this.last=this.norD(last);
        this.setDur();
    }
    @Override 
    public String toString() 
    {
        try
        {
        return id+" "+name+" "+room+" "+dur+" "+getCost();
        }
        catch(ParseException e)
        {
            
        }
        return "";
    }
    @Override
    public int compareTo(KHACHHANG kh) 
    {
        try{
        return Long.compare(kh.getCost(), this.getCost());
        }
        catch(ParseException e)
        {
            
        }
        return 0;
    }
}
