/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05029;

/**
 *
 * @author Moment
 */

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        DN dn[]=new DN[n];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            dn[i]=new DN(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        Arrays.sort(dn);
        int t=sc.nextInt();
        while(t-->0)
        {
            int x=sc.nextInt(),y=sc.nextInt();
            System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:\n",x,y);
            for(DN i:dn)
            {
                if(i.getQtt()>=x&&i.getQtt()<=y)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
//4
//VIETTEL
//TAP DOAN VIEN THONG QUAN DOI VIETTEL
//40
//FSOFT
//CONG TY TNHH PHAN MEM FPT - FPT SOFTWARE
//300
//VNPT
//TAP DOAN BUU CHINH VIEN THONG VIET NAM
//200
//SUN
//SUN*
//50
//1
//30 50
