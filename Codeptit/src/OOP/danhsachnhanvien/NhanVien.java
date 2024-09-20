/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.danhsachnhanvien;

/**
 *
 * @author Moment
 */
public class NhanVien {
    private String id,ten,gioitinh,ngaysinh,diachi,masothue,ngayki;
    public NhanVien(int i,String ten,String gioitinh, String ngaysinh,String diachi,String masothue,String ngayki)
    {
        this.id="000"+String.format("%02d",i);
        this.ten=ten;
        this.gioitinh=gioitinh;
        this.diachi=diachi;
        this.ngaysinh=ngaysinh;
        this.masothue=masothue;
        this.ngayki=ngayki;
    }
    public String toString()
    {
        return id+" "+ten+" "+gioitinh+" "+ngaysinh+" "+diachi+" "+masothue+" "+ngayki;
    }
}
