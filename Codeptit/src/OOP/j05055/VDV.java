/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05055;

import java.util.Date;

/**
 *
 * @author Moment
 */
public class VDV {
    private String id,name,dob;
    private Date beginDate,finishDate;
    private int rank;

    public VDV(String id,String name, String dob, Date beginDate, Date finishDate) {
        this.id=id;
        this.name = name;
        this.dob = dob;
        this.beginDate = beginDate;
        this.finishDate = finishDate;
    }
    private int getAge()
    {
        return 2021-Integer.parseInt(dob.substring(6));
    }
    private String priority()
    {
        int age=this.getAge();
        String res="00:00:0";
        if(age<18)
        {
            return res+"0";
        }
        else
        {
            if(age<25)
            {
                return res+"1";
            }
            else
            {
                if(age<32)
                {
                    return res+"2";
                }
                else
                {
                    return res+"3";
                }
            }
        }
    }
    public void setRank(int rank)
    {
        this.rank=rank;
    }
    private long realSecs()
    {
        return finishDate.getTime()-beginDate.getTime();
    }
    private String realString()
    {
        long res=this.realSecs();
        res/=1000;
        int hour=(int)res/(3600);
        int minute=(int)(res%3600)/60;
        int sec=(int)res%60;
        return String.format("%02d:%02d:%02d", hour,minute,sec);
    }
    public long getTotalSecs()
    {
        int pri=Integer.parseInt(this.priority().substring(7,8));
        long totalSecs=(this.realSecs())-(pri*1000);
        return totalSecs;
    }
    private String totalString()
    {
        long res=this.getTotalSecs();
        res/=1000;
        int hour=(int)res/(3600);
        int minute=(int)(res%3600)/60;
        int sec=(int)res%60;
        return String.format("%02d:%02d:%02d", hour,minute,sec);
    } 
    public String toString()
    {
        return id+" "+name+" "+this.realString()+" "+this.priority()+" "+this.totalString()+" "+rank;
    }
    
    
    
    
}
