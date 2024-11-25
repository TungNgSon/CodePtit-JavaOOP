/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05028;

/**
 *
 * @author Moment
 */
public class DN implements Comparable<DN>
{
    private String id,name;
    private int qtt;
    public DN(String id,String name,int qtt)
    {
        this.id=id;
        this.name=name;
        this.qtt=qtt;
    }
    public String toString()
    {
        return id+" "+name+" "+qtt;
    }
    @Override 
    public int compareTo(DN dn)
    {
        if(this.qtt==dn.qtt)
        {
            return this.id.compareTo(dn.id);
        }
        return dn.qtt-this.qtt;
    }
    
}
