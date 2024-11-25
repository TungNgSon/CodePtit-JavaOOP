/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05011;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moment
 */
public class Customer implements Comparable<Customer>
{
    private String id,name,arriveTime,leaveTime;
    public Customer(String id,String name,String arriveTime,String leaveTime)
    {
        this.id=id;
        this.name=name;
        this.arriveTime=arriveTime;
        this.leaveTime=leaveTime;
    }
    public long getDuration() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm");
        Date arriveDate=sdf.parse(arriveTime);
        Date leaveDate=sdf.parse(leaveTime);
        return leaveDate.getTime()-arriveDate.getTime();
        
    }
    public long getHour() throws ParseException
    {
        return this.getDuration()/(1000*3600);
    }
    public long getMinute() throws ParseException
    {
        return (this.getDuration()%(1000*3600))/(1000*60);
    }
    public String toString()
    {
        try {
            return id+" "+name+" "+Long.toString(this.getHour())+" gio "+Long.toString(this.getMinute())+" phut";
        } catch (ParseException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    @Override 
    public int compareTo(Customer c)
    {
        try {
            return Long.compare(c.getDuration(), this.getDuration());
        } catch (ParseException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
