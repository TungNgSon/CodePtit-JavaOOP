/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses.tochucICPC;

/**
 *
 * @author Moment
 */
public class Team implements Comparable<Team>
{
    private String id,name;
    private Uni uni;
    public Team(String name,Uni uni)
    {
        this.name=name;
        this.uni=uni;
    }
    public void setId(String id)
    {
        this.id=id;
    }
    public String toString()
    {
        return this.id+" "+this.name+" "+this.uni.getName();
    }
    @Override public int compareTo(Team t)
    {
        if(this.uni.getName().equals(t.uni.getName()))
        {
            return this.name.compareTo(t.name);
        }
        return this.uni.getName().compareTo(t.uni.getName());
    }
    
}
