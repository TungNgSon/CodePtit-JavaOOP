/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.banhang;

/**
 *
 * @author Moment
 */
public class HoaDon {
    private String id;
    private KhachHang kh;
    private MatHang mh;
    private int quantity;
    public HoaDon(int i,KhachHang kh,MatHang mh,int quantity)
    {
        this.id="HD"+String.format("%03d", i);
        this.kh=kh;
        this.mh=mh;
        this.quantity=quantity;
    }
    public int getTotal()
    {
        return this.mh.getCost()*this.quantity;
    }
    public String toString()
    {
       return id+" "+kh.toString()+" "+mh.toString()+" "+this.quantity+" "+this.getTotal();
    }
    
}
