/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses.dsICPC;

/**
 *
 * @author Moment
 */
public class Team {
    private String id,name,uni;
    public Team(int i,String name,String uni)
    {
        this.id="Team"+String.format("%02d", i);
        this.name=name;
        this.uni=uni;
        
    }
    public String getName()
    {
        return this.name;
    }
    public String getUni()
    {
        return this.uni;
    }
}
