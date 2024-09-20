/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07048;

/**
 *
 * @author Moment
 */
public class SANPHAM implements Comparable<SANPHAM>
{
    
    private String id,name;
    private int cost,insurance;
    public SANPHAM(String id, String name, int cost,int insurance)
    {
        this.id=id;
        this.name=name;
        this.cost=cost;
        this.insurance=insurance;
    }
    public String getID()
    {
        return this.id;
    }
    public int getCost()
    {
        return this.cost;
    }
    @Override
    public String toString()
    {
        return this.id+" "+this.name+" "+this.cost+" "+this.insurance;
    }
    @Override
    public int compareTo(SANPHAM sp)
    {
        if(this.cost==sp.getCost())
        {
            return this.id.compareTo(sp.getID());
        }
        return sp.getCost()-this.cost;
    }
}
