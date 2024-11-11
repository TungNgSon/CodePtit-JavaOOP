/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.dongphuc;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException
    { 
        Scanner sc1=new Scanner(new File("SINHVIEN.in"));
        int n=sc1.nextInt();
        sc1.nextLine();
        SinhVien sv[]=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            sv[i]=new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
        }
        Arrays.sort(sv);
        Scanner sc2=new Scanner(new File("DANGKY.in"));
        for(int i=0;i<n;i++)
        {
            String id=sc2.next();
            String size=sc2.next();
            for(int j=0;j<n;j++)
            {
                if(sv[j].getId().equals(id))
                {
                    sv[j].setSize(size);
                    break;
                }
            }
        }
        Scanner sc3=new Scanner(new File("TRUYVAN.in"));
        int q=sc3.nextInt();
        while(q-->0)
        {
            String gt=sc3.next();
            String size=sc3.next();
            System.out.println("DANH SACH SINH VIEN "+gt.toUpperCase()+" DANG KY SIZE "+size);
            for(int i=0;i<n;i++)
            {
                if(sv[i].getSize().equals(size)&&sv[i].getGt().equals(gt))
                {
                    System.out.println(sv[i]);
                }
            }
            
        }
    }
}
