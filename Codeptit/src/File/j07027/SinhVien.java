/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.j07027;

/**
 *
 * @author Moment
 */
public class SinhVien {
    private String id,name,phoneNumber;
    public SinhVien(String id,String name,String phoneNumber)
    {
        this.id=id;
        this.name=name;
        this.phoneNumber=phoneNumber;
    }
    public String getId()
    {
        return this.id;
    }
    public String toString()
    {
        return id+" "+name+" "+phoneNumber; 
    }
    
    
}
