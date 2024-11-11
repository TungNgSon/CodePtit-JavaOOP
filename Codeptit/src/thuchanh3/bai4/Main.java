/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai4;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("MUAHANG.in"));
        int n=Integer.parseInt(sc.nextLine());
        SanPham sp[]=new SanPham[n];
        for(int i=0;i<n;i++)
        {
            sp[i]=new SanPham(sc.nextLine(),sc.nextLine(),Long.parseLong(sc.nextLine()),Integer.parseInt(sc.nextLine()));
        }
        int m=Integer.parseInt(sc.nextLine());
        KhachHang kh[]=new KhachHang[m];
        for(int i=0;i<m;i++)
        {
            String id="KH"+String.format("%02d", i+1);
            String name=sc.nextLine();
            String address=sc.nextLine();
            String idSp=sc.nextLine();
            long quantity=Long.parseLong(sc.nextLine());
            String buyDay=sc.nextLine();
            SanPham sanPham=new SanPham("","",0,0);
            for(int j=0;j<n;j++)
            {
                if(sp[j].getId().equals(idSp))
                {
                    sanPham=sp[j];
                    break;
                }
            }
            kh[i]=new KhachHang(id,name,address,sanPham,quantity,buyDay);
        }
        Arrays.sort(kh);
        for(KhachHang x:kh)
        {
            System.out.println(x);
        }
    }
}
