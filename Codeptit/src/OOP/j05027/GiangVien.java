/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05027;

/**
 *
 * @author Moment
 */
public class GiangVien {
    private String id,name,department;
    public GiangVien(int i, String name,String department)
    {
        this.id=String.format("GV%02d", i);
        this.name=name;
        this.department=department;
    }
    public String getAcronymDepartment()
    {
        String a[]=this.department.trim().split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++)
        {
            res=res+a[i].substring(0, 1).toUpperCase();
        }
        return res;
    }
    public boolean hasKeyword(String s)
    {
        String name1=this.name.toLowerCase();
        String str=s.toLowerCase();
        if(name1.contains(str))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return id+" "+name+" "+this.getAcronymDepartment();
    }
}
