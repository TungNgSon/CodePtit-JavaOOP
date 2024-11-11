/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.doantotnghiep;

/**
 *
 * @author Moment
 */
public class SinhVien implements Comparable<SinhVien>
{
    private String id,ten,lop,email,sdt;
    private String gv,doan;
    public SinhVien(String id,String ten,String lop,String email,String sdt)
    {
        this.id=id;
        this.ten=ten;
        this.email=email;
        this.lop=lop;
        this.sdt="0"+sdt;
    }
    public void setGv(String gv)
    {
        this.gv=gv;
    }
    public String getId()
    {
        return this.id;
    }
    public void setDoan(String doan)
    {
        this.doan=doan;
    }
    public String toString()
    {
        return id+" "+ten+" "+gv+" "+doan+" "+sdt;
    }
    @Override public int compareTo(SinhVien sv)
    {
        return this.id.compareTo(sv.id);
    }
}
