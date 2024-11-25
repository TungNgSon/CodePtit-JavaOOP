/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05025;

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
            String id="GV"+String.format("%02d", i+1);
            gv[i]=new GiangVien(id,sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(gv);
        for(GiangVien x:gv)
        {
            System.out.println(x);
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
