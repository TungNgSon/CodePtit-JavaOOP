/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moment
 */
public class KhachHang implements Comparable<KhachHang>
{
    private String id,name,address;
    private SanPham sp;
    private long quantity;
    private String buyDay;

    public KhachHang(String id, String name, String address, SanPham sp, long quantity, String buyDay) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.sp = sp;
        this.quantity = quantity;
        this.buyDay = buyDay;
    }
    private long getTotal()
    {
        return this.quantity*this.sp.getPrice();
    }
    private String getDate()
    {
        String a[]=this.buyDay.split("/");
        int day=Integer.parseInt(a[0]);
        int month=Integer.parseInt(a[1]);
        int year=Integer.parseInt(a[2]);
        int insTime=sp.getInsuranceTime();
        year+=(insTime/12);
        month+=(insTime%12);
        String res="";
        res+=String.format("%02d/%02d/%04d", day,month,year);
        return res;
    }
    private long getSecond() throws ParseException
    {
        String a[]=this.buyDay.split("/");
        int day=Integer.parseInt(a[0]);
        int month=Integer.parseInt(a[1]);
        int year=Integer.parseInt(a[2]);
        int insTime=sp.getInsuranceTime();
        year+=(insTime/12);
        month+=(insTime%12);
        String res="";
        res+=String.format("%02d/%02d/%04d", day,month,year);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sdf.parse(res);
        return date.getTime();
    }
    public String toString()
    {
        return id+" "+name+" "+address+" "+this.sp.getId()+" "+this.getTotal()+" "+this.getDate();
    }
    @Override 
    public int compareTo(KhachHang kh)
    {
        try {
            if(this.getSecond()==kh.getSecond())
            {
                return this.id.compareTo(kh.id);
            }
        } catch (ParseException ex) {
            Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            return Long.compare(this.getSecond(), kh.getSecond());
        } catch (ParseException ex) {
            Logger.getLogger(KhachHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
    
}
