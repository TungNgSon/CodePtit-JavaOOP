/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.j07027;

/**
 *
 * @author Moment
 */
public class BaiTap {
    private String id,name;
    public BaiTap(String id,String name)
    {
        this.id=id;
        this.name=name;
    }
    public String getId()
    {
        return this.id;
    }
    public String toString()
    {
        return id+" "+name;
    }
}
