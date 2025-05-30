/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05022;

import java.util.*;

/**
 *
 * @author Moment
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        SinhVien sv[]=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            sv[i]=new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String idClass=sc.nextLine();
            System.out.println(String.format("DANH SACH SINH VIEN LOP %S:", idClass));
            for(SinhVien x:sv)
            {
                if(x.getIdClass().equals(idClass))
                {
                    System.out.println(x);
                }
            }
        }
    }
}
//4
//B16DCCN011
//Nguyen Trong Duc Anh
//D16CNPM1
//sv1@stu.ptit.edu.vn
//B15DCCN215
//To Ngoc Hieu
//D15CNPM3
//sv2@stu.ptit.edu.vn
//B15DCKT150
//Nguyen Ngoc Son
//D15CQKT02-B
//sv3@stu.ptit.edu.vn
//B15DCKT199
//Nguyen Trong Tung
//D15CQKT02-B
//sv4@stu.ptit.edu.vn
//1
//D15CQKT02-B
