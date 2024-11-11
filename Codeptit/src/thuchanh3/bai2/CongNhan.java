/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moment
 */
public class CongNhan implements Comparable<CongNhan>
{
    private String id,name,arrive,leave;
    public CongNhan(String id,String name,String arrive,String leave)
    {
        this.id=id;
        this.name=name;
        this.arrive=arrive;
        this.leave=leave;
    }
    private long getWorkingTime() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        Date arr=sdf.parse(this.arrive);
        Date lea=sdf.parse(this.leave);
        return lea.getTime()-arr.getTime()-3600000;
    }
    private long getHour() throws ParseException
    {
        return this.getWorkingTime()/(1000*3600);
    }
    private long getMinute() throws ParseException
    {
        return (this.getWorkingTime()%(1000*3600))/(1000*60);
    }
    private String getStatus() throws ParseException
    {
        if(this.getHour()>=8)
        {
            return "DU";
        }
        else
        {
            return "THIEU";
        }
    }
    public String toString()
    {
        try {
            return id+" "+name+" "+this.getHour()+" gio "+this.getMinute()+" phut "+this.getStatus();
        } catch (ParseException ex) {
            Logger.getLogger(CongNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    @Override
    public int compareTo(CongNhan cn)
    {
        try {
            if(this.getWorkingTime()==cn.getWorkingTime())
            {
                return this.id.compareTo(cn.id);
            }
        } catch (ParseException ex) {
            Logger.getLogger(CongNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return Long.compare(cn.getWorkingTime(), this.getWorkingTime());
        } catch (ParseException ex) {
            Logger.getLogger(CongNhan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
