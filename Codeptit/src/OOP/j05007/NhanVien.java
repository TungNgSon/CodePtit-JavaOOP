/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05007;

/**
 *
 * @author Moment
 */
import java.text.*;
public class NhanVien implements Comparable<NhanVien>
{
    private String id,name,sex,dob,add,tax,day;
    public NhanVien(int i,String name,String sex,String dob,String add,String tax,String day)
    {
        this.id=String.format("%05d", i);
        this.name=name;
        this.day=day;
        this.dob=dob;
        this.tax=tax;
        this.sex=sex;
        this.add=add;
    }
    public String toString()
    {
        return id+" "+name+" "+sex+" "+dob+" "+add+" "+tax+" "+day;
    }
    public String getDob()
    {
        return this.dob;
    }
    @Override public int compareTo(NhanVien nv) 
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            return -Long.compare(sdf.parse(nv.getDob()).getTime(), sdf.parse(this.getDob()).getTime());
        }
        catch(ParseException e)
        {
            
        } 
        return 0;
    }
    
}
