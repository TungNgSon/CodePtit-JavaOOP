/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.j07027;

/**
 *
 * @author Moment
 */
public class Nhom implements Comparable<Nhom>
{
    private SinhVien sv;
    private BaiTap bt;
    public Nhom(SinhVien sv,BaiTap bt)
    {
        this.sv=sv;
        this.bt=bt;
    }
    public String toString()
    {
        return sv.toString()+" "+bt.toString();
    }
    @Override
    public int compareTo(Nhom n)
    {
        return this.sv.getId().compareTo(n.sv.getId());
    }
    
}
