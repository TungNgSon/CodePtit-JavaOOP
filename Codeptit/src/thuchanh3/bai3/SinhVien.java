/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai3;

/**
 *
 * @author Moment
 */
public class SinhVien implements Comparable<SinhVien>
{
    private String id,name,idClass,email,phoneNumber;
    public SinhVien(String id,String name,String idClass,String email,String phoneNumber)
    {
        this.id=id;
        this.name=name;
        this.idClass=idClass;
        this.email=email;
        this.phoneNumber="0"+phoneNumber;
    }
    public String toString()
    {
        return id+" "+name+" "+idClass+" "+email+" "+phoneNumber;
    }
    @Override 
    public int compareTo(SinhVien sv)
    {
        if(this.idClass.equals(sv.idClass))
        {
            return this.id.compareTo(sv.id);
        }
        return this.idClass.compareTo(sv.idClass);
    }
    
}
