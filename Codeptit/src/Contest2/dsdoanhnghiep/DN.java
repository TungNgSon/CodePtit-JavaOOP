/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2.dsdoanhnghiep;

/**
 *
 * @author Moment
 */
public class DN implements Comparable<DN>
{
    private String id,name;
    private int num;
    public DN(String id,String name,int num)
    {
        this.id=id;
        this.name=name;
        this.num=num;
    }
    public String toString()
    {
        return id+" "+name+" "+num;
    }
    public String getId()
    {
        return this.id;
    }
    @Override public int compareTo(DN dn)
    {
        return id.compareTo(dn.getId());
    }
}
