/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05018;

/**
 *
 * @author Moment
 */
public class Student implements Comparable<Student>
{
    private String id,name;
    private Double points[];

    public Student(String id, String name, Double[] points) {
        this.id = id;
        this.name = name;
        this.points = points;
    }
    public double avgPoints()
    {
        double sum=0;
        sum+=(points[0]*2)+(points[1]*2);
        for(int i=2;i<10;i++)
        {
            sum+=points[i];
        }
        return sum*1.0/12;
    }
    public String getStatus()
    {
        double score=this.avgPoints();
        if(score>=9)
        {
            return "XUAT SAC";
        }
        else
        {
            if(score>=8)
            {
                return "GIOI";
            }
            else
            {
                if(score>=7)
                {
                    return "KHA";
                }
                else
                {
                    if(score>=5)
                    {
                        return "TB";
                    }
                    else
                    {
                        return "YEU";
                    }
                }
            }
        }
    }
    public String toString()
    {
        double score=this.avgPoints();
        score=Math.round(score*10.0)/10.0;
        return id+" "+name+" "+String.format("%.1f", score)+" "+this.getStatus();
    }
    @Override
    public int compareTo(Student o)
    {
        if(this.avgPoints()==o.avgPoints())
        {
            return this.id.compareTo(o.id);
        }
        return Double.compare(o.avgPoints(), this.avgPoints());
    }
    
}
