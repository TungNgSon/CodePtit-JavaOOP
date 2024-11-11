/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.danhsachcanh;

/**
 *
 * @author Moment
 */
public class Pair <K ,V>
{
    private K first;
    private V second;
    public Pair (K first,V second)
    {
        this.first=first;
        this.second=second;
    }
    public String toString()
    {
        return "("+this.first+","+this.second+")";
    }
    
}
