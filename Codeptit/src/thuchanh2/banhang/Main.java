/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.banhang;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        //KhachHang
        Scanner sc1=new Scanner(new File("KH.in"));
        int n=sc1.nextInt();
        sc1.nextLine();
        KhachHang kh[]=new KhachHang[n];
        for(int i=0;i<n;i++)
        {
            kh[i]=new KhachHang(i+1,sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
        }
        //MatHang
        Scanner sc2=new Scanner(new File("MH.in"));
        int m=sc2.nextInt();
        MatHang mh[]=new MatHang[m];
        for(int i=0;i<m;i++)
        {
            sc2.nextLine();
            mh[i]=new MatHang(i+1,sc2.nextLine(),sc2.nextLine(),sc2.nextInt(),sc2.nextInt());
        }
        //HoaDon
        Scanner sc3=new Scanner(new File("HD.in"));
        int q=sc3.nextInt();
        HoaDon hd[]=new HoaDon[q];
        for(int i=0;i<q;i++)
        {
            String idKh=sc3.next();
            String idMh=sc3.next();
            int qtt=sc3.nextInt();
            int idxKh=Integer.parseInt(idKh.substring(2))-1;
            int idxMh=Integer.parseInt(idMh.substring(2))-1;
            hd[i]=new HoaDon(i+1,kh[idxKh],mh[idxMh],qtt);
        }
        for(HoaDon x:hd)
        {
            System.out.println(x);
        }
        
        
        
    }
}
