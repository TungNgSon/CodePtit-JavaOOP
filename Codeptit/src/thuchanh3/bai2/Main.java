/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai2;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.text.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        CongNhan cn[]=new CongNhan[n];
        for(int i=0;i<n;i++)
        {
            cn[i]=new CongNhan(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        }
        Arrays.sort(cn);
        for(CongNhan x:cn)
        {
            System.out.println(x);
        }
    }
}
//2
//01T
//Nguyen Van An
//08:00
//17:30
//06T
//Tran Hoa Binh
//09:05
//22:00
