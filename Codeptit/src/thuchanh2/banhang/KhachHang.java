/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.banhang;

/**
 *
 * @author Moment
 */
public class KhachHang {
    private String id,ten,gt,ngsinh,diachi;
    public KhachHang(int i,String ten,String gt,String ngsinh,String diachi)
    {
        this.id="KH"+String.format("%03d", i);
        this.ten=ten;
        this.gt=gt;
        this.ngsinh=ngsinh;
        this.diachi=diachi;
    }
    public String toString()
    {
        return ten+" "+diachi;
    }
}
