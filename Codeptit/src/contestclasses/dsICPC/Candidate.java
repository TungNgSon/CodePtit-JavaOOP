/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses.dsICPC;

/**
 *
 * @author Moment
 */
public class Candidate implements Comparable<Candidate>
{
    private String id,name;
    private Team team;
    public Candidate(int i,String name)
    {
        this.id="C"+String.format("%03d",i);
        this.name=name;
    }
    public void setTeam(Team team)
    {
        this.team=team;
    }
    public String toString()
    {
        return this.id+" "+this.name+" "+this.team.getName()+" "+this.team.getUni();
    }
    @Override public int compareTo(Candidate c)
    {
        return this.name.compareTo(c.name);
    }
}
