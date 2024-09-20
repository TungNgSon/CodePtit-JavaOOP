/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07033;

/**
 *
 * @author Moment
 */
public class SinhVien implements Comparable<SinhVien>
{
    private String id, name, idc, email;
    public SinhVien(String id, String name, String idc, String email)
    {
        this.id=id;
        this.name=name;
        this.idc=idc;
        this.email=email;
    }
    public String getId()
    {
        return this.id;
    }
    public void normalize()
    {
        String a[]=name.trim().split("\\s+");
        String res="";
        for(String x:a)
        {
            res=res+x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        name=res.trim();
                
    }
    @Override
    public String toString()
    {
        normalize();
        return id+" "+name+" "+idc+" "+email;
    }
    @Override 
    public int compareTo(SinhVien s)
    {
        return id.compareTo(s.getId());
    }
}
