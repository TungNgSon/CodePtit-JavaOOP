/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.j07027;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.math.BigInteger;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        BigInteger a1=new BigInteger("123");
        System.out.println(a1.add(BigInteger.valueOf(12)));
        
        Scanner sc1=new Scanner(new File("SINHVIEN.in"));
        Scanner sc2=new Scanner(new File("BAITAP.in"));
        Scanner sc3=new Scanner(new File("NHOM.in"));
        //SinhVien
        int n=sc1.nextInt();
        sc1.nextLine();
        SinhVien sv[]=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            sv[i]=new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
        }
        //BaiTap
        int m=sc2.nextInt();
        sc2.nextLine();
        BaiTap bt[]=new BaiTap[m];
        for(int i=0;i<m;i++)
        {
            String id=Integer.toString(i+1);
            bt[i]=new BaiTap(id,sc2.nextLine());
        }
        //Nhom
        Nhom nh[]=new Nhom[n];
        for(int i=0;i<n;i++)
        {
            String a[]=sc3.nextLine().split("\\s+");
            String idSv=a[0];
            String idBt=a[1];
            SinhVien tmpSv=new SinhVien("","","");
            BaiTap tmpBt=new BaiTap("","");
            for(SinhVien x:sv)
            {
                if(x.getId().equals(idSv))
                {
                    tmpSv=x;
                    break;
                }
            }
            for(BaiTap x:bt)
            {
                if(x.getId().equals(idBt))
                {
                    tmpBt=x;
                    break;
                }
            }
            nh[i]=new Nhom(tmpSv,tmpBt);
        }
        Arrays.sort(nh);
        for(Nhom x:nh)
        {
            System.out.println(x);
        }
    }
}
