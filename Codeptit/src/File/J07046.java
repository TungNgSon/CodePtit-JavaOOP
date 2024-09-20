/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.text.*;
import java.io.*;
import java.util.*;
class Khach implements Comparable<Khach>
{
    private String id,name,idr;
    private Date first,last;
    private long dur;
    public Khach(int i,String name,String idr,Date first, Date last)
    {
        this.id="KH"+String.format("%02d", i);
        this.name=name;
        this.idr=idr;
        long ft=first.getTime()/(24*60*60*1000);
        long lt=last.getTime()/(24*60*60*1000);
        this.dur=lt-ft;
    }
    public long getDur()
    {
        return this.dur;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+idr+" "+dur;
    }
    @Override 
    public int compareTo(Khach kh)
    {
        return Long.compare(kh.getDur(),this.dur);
        
    }
    
}
public class J07046 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("KHACH.in"));
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        int n=Integer.parseInt(inp.nextLine());
        Khach kh[]=new Khach[n];
        for(int i=0;i<n;i++)
        {
            try
            {
            kh[i]=new Khach(i+1,inp.nextLine(),inp.nextLine(),sdf.parse(inp.nextLine()),sdf.parse(inp.nextLine()));
            }
            catch(Exception e)
                    {
                        
                    }
        }
        Arrays.sort(kh);
        for(Khach x:kh)
        {
            System.out.println(x);
        }
        
    }
}
