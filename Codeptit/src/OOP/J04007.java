/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.*;
class NhanVien
{
    private String id,name,sex,birth,address,tax,date;
    public NhanVien(String name, String sex,String birth, String address,String tax, String date)
    {
        this.id="00001";
        this.name=name;
        this.sex=sex;
        this.birth=birth;
        this.address=address;
        this.tax=tax;
        this.date=date;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+ sex+" "+birth+" "+address+" "+tax+" "+date;
    }
}
public class J04007 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        NhanVien nv=new NhanVien(inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine());
        System.out.println(nv);
    }
    
}
