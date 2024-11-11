/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.banhang;

/**
 *
 * @author Moment
 */
public class MatHang {
    private String id,ten,dvi;
    private int mua,ban;
    public MatHang(int i,String ten,String dvi,int mua,int ban)
    {
        this.id="MH"+String.format("03d", i);
        this.ten=ten;
        this.dvi=dvi;
        this.mua=mua;
        this.ban=ban;
    }
    public int getCost()
    {
        return this.ban;
    }
    public String toString()
    {
        return ten+" "+dvi+" "+mua+" "+ban;
    }
}
