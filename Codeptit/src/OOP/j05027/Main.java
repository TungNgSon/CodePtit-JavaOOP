/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05027;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        GiangVien gv[]=new GiangVien[n];
        for(int i=0;i<n;i++)
        {
            gv[i]=new GiangVien(i+1,sc.nextLine(),sc.nextLine());
        }
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            System.out.println(String.format("DANG SACH GIANG VIEN THEO TU KHOA %s:", s));
            for(GiangVien x:gv)
            {
                if(x.hasKeyword(s))
                {
                    System.out.println(x);
                }
            }
        }
    }
}
//3
//Nguyen Manh Son
//Cong nghe phan mem
//Vu Hoai Nam
//Khoa hoc may tinh
//Dang Minh Tuan
//An toan thong tin
//1
//aN
