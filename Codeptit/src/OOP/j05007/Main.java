/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05007;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NhanVien nv[]=new NhanVien [n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            nv[i]=new NhanVien(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(nv);
        for(NhanVien x:nv)
        {
            System.out.println(x);
        }
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011