/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05030;

/**
 *
 * @author Moment
 */
public class Student implements Comparable<Student>
{
    private String id,name,idc;
    private double p1,p2,p3;
    private int stt;

    public Student(int stt,String id, String name,String idc, double p1, double p2, double p3) {
        this.stt=stt;
        this.id = id;
        this.name = name;
        this.idc=idc;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    public String formatPoint(double x)
    {
        return String.format("%.1f", x);
    }
    public String toString()
    {
        return id+" "+name+" "+idc+" "+formatPoint(p1)+" "+formatPoint(p2)+" "+formatPoint(p3);
    }
    @Override
    public int compareTo(Student st)
    {
        return this.id.compareTo(st.id);
    }
    
}
