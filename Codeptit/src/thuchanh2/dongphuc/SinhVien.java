/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.dongphuc;

/**
 *
 * @author Moment
 */
public class SinhVien implements Comparable<SinhVien>
{
    private String ten,id,lop,email,sdt,gt,size;
    public SinhVien(String id,String ten,String lop,String email,String sdt,String gt)
    {
        this.id=id;
        this.ten=ten;
        this.lop=lop;
        this.email=email;
        this.sdt=sdt;
        this.gt=gt;
    }
    public String getId()
    {
        return this.id;
    }
    public String getGt()
    {
        return this.gt;
    }
    public String getSize()
    {
        return this.size;
    }
    public void setSize(String size)
    {
        this.size=size;
    }
    public String toString()
    {
        return id+" "+ten+" "+lop+" "+email+" "+sdt;
    }
    @Override public int compareTo(SinhVien sv)
    {
        return this.id.compareTo(sv.id);
    }
}
