/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest1.ds_icpc;

/**
 *
 * @author Moment
 */
public class Candidate implements Comparable<Candidate>
{
    private String id,name,idt,team,uni;
    public Candidate(int i,String name,String idt)
    {
        this.id="C"+String.format("%03d", i);
        this.name=name;
        this.idt=idt;
    }
    public void setTeam(Team t)
    {
        this.team=t.getName();
        this.uni=t.getUni();
    }
    public String getName()
    {
        return this.name;
    }
    public String getIdt()
    {
        return this.idt;
    }
    public String toString()
    {
        return id+" "+name+" "+team+" "+uni;
    }
    @Override public int compareTo(Candidate c)
    {
        return this.name.compareTo(c.getName());
    }
    
}
