/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2.dsmonhoc;

/**
 *
 * @author Moment
 */
public class MonHoc implements Comparable<MonHoc>
{
    private String id,name;
    private int cre;
    public MonHoc(String id,String name,int cre)
    {
        this.id=id;
        this.name=name;
        this.cre=cre;
    }
    public String toString()
    {
        return id+" "+name+" "+cre;
    }
    public String getName()
    {
        return this.name;
    }
    @Override public int compareTo(MonHoc mh)
    {
        return name.compareTo(mh.getName());
    }
}
