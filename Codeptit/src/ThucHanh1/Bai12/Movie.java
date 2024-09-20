/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1.Bai12;

/**
 *
 * @author Moment
 */
import java.text.*;
import java.util.Date;
public class Movie implements Comparable<Movie>
{
    private String mtype,name,id;
    private String rl;
    private int eps;
    public Movie(int i,String mtype, String rl,String name,int eps)
    {
        this.id="P"+String.format("%03d", i);
        this.mtype=mtype;
        this.rl=rl;
        this.name=name;
        this.eps=eps;
                
    }
    public String getType()
    {
        return this.mtype;
    }
    public long getDay() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date rl1=sdf.parse(rl);
       long secs=rl1.getTime();
       return secs;
    }
    public String getName()
    {
        return this.name;
    }
    public int getEps()
    {
        return this.eps;
    }
    public void setType(String s)
    {
        this.mtype=s;
    }
    @Override public String toString()
    {
        return id+" "+mtype+" "+rl+" "+name+" "+eps;
    }
    @Override public int compareTo(Movie m) 
    {
        try
        {
        if(this.getDay()!=m.getDay())
        {
            return Long.compare(this.getDay(), m.getDay());
        }
        else
        {
            if(!this.name.equals(m.getName()))
            {
                return this.name.compareTo(m.getName());
            }
            return this.getEps()-m.getEps();
        }
        }
        catch(Exception e)
        {
            
        }
        return 0;
    }
}
