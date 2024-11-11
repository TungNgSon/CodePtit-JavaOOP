/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses.giogiangday;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc1=new Scanner(new File("GIANGVIEN.in"));
        Scanner sc2=new Scanner(new File("GIOCHUAN.in"));
        int n=Integer.parseInt(sc1.nextLine());
        GiangVien gv[]=new GiangVien[n];
        for(int i=0;i<n;i++)
        {
            gv[i]=new GiangVien(sc1.next(),sc1.nextLine());
        }
        int t=sc2.nextInt();
        while(t-->0)
        {
            String idGv=sc2.next();
            sc2.next();
            double amountTime=sc2.nextDouble();
            for(GiangVien x:gv)
            {
                if(x.getId().equals(idGv))
                {
                    x.addTime(amountTime);
                }
            }
            
        }
        for(GiangVien x:gv)
        {
            System.out.println(x);
        }
        
    }
}
