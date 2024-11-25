/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05025;

/**
 *
 * @author Moment
 */
public class GiangVien implements Comparable<GiangVien>
{
    private String id,name,major;
    public GiangVien(String id,String name,String major)
    {
        this.id=id;
        this.name=name;
        this.major=major;
    }
    public String getName()
    {
        String a[]=this.name.trim().split("\\s+");
        return a[a.length-1];
    }
    public String getAcronymMajor()
    {
        String a[]=this.major.trim().split("\\s+");
        String res="";
        for(String x:a)
        {
            res+=x.substring(0,1).toUpperCase();
        }
        return res;
    }
    public String toString()
    {
        return id+" "+name+" "+this.getAcronymMajor();
    }
    @Override 
    public int compareTo(GiangVien gv)
    {
        if(gv.getName().equals(this.getName()))
        {
            return this.id.compareTo(gv.id);
        }
        return this.getName().compareTo(gv.getName());
    }
    
}
