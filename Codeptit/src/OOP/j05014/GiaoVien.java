/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05014;

/**
 *
 * @author Moment
 */
public class GiaoVien implements Comparable<GiaoVien>
{
    private String name,id,subject,state;
    private double cs,spe;
    public GiaoVien(int i,String name,String subject,double cs,double spe)
    {
        this.id=String.format("GV%02d", i);
        this.name=name;
        this.subject=subject;
        this.cs=cs;
        this.spe=spe;
        this.setSubject();
        this.setState();
    }
    public double getBonus()
    {
        int n=Integer.parseInt(this.subject.substring(1));
        if(n==1)
        {
            return 2.0;
        }
        else
        {
            if(n==2)
            {
                return 1.5;
            }
            else
            {
                if(n==3)
                {
                    return 1.0;
                }
                return  0;
            }
        }
    }
    public void setSubject()
    {
        char c=subject.charAt(0);
        if(c=='A')
        {
            subject="Toan";
        }
        else
        {
            if(c=='B')
            {
                subject="Ly";
            }
            else
            {
                subject="Hoa";
            }
        }
    }
    public double getTotal()
    {
        return cs*2+spe+getBonus();
    }
    public void setState()
    {
        if(getTotal()>=18)
        {
            this.state="TRUNG TUYEN";
        }
        else
        {
            this.state="LOAI";
        }
    }
    public String toString()
    {
        return this.id+" "+this.name+" "+this.subject+" "+String.format("%.1f", this.getTotal())+" "+this.state;
    }
    @Override public int compareTo(GiaoVien gv)
    {
        return Double.compare(gv.getTotal(), this.getTotal());
    }
    
    
}
