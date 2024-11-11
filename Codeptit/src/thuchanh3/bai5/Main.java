/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai5;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc1=new Scanner(new File("GIANGVIEN.in"));
        int n=sc1.nextInt();
        GIANGVIEN gv[]=new GIANGVIEN[n];
        for(int i=0;i<n;i++)
        {
            gv[i]=new GIANGVIEN(sc1.next(),sc1.nextLine());
        }
        Scanner sc2=new Scanner(new File("GIOCHUAN.in"));
        int t=sc2.nextInt();
        while(t-->0)
        {
            String id=sc2.next();
            sc2.next();
            double amount=sc2.nextDouble();
            for(GIANGVIEN x:gv)
            {
                if(x.getId().equals(id))
                {
                    x.addTime(amount);
                }
            }
        }
        for(GIANGVIEN x:gv)
        {
            System.out.println(x);
        }
    }
}
