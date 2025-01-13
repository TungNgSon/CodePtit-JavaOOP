/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.j07035;

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
        Scanner sc2=new Scanner(new File("MONHOC.in"));
        Scanner sc3=new Scanner(new File("BANGDIEM.in"));
        int n=Integer.parseInt(sc1.nextLine());
        SinhVien sv[]=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            sv[i]=new SinhVien(sc1.nextLine(),sc1.nextLine(),sc1.nextLine(),sc1.nextLine());
        }
        //
        int m=Integer.parseInt(sc2.nextLine());
        MonHoc mh[]=new MonHoc[m];
        for(int i=0;i<m;i++)
        {
            mh[i]=new MonHoc(sc2.nextLine(),sc2.nextLine(),Integer.parseInt(sc2.nextLine()));
        }
        //
        int q=Integer.parseInt(sc3.nextLine());
        BangDiem bd[]=new BangDiem[q];
        for(int i=0;i<q;i++)
        {
            String s[]=sc3.nextLine().split("\\s+");
            String id=s[0];
            String idMH=s[1];
//            double score=Double.parseDouble(s[2]);
            String score=s[2];
            SinhVien tmpSv = new SinhVien("1","1","1","1");
            MonHoc tmpMh = new MonHoc("1","1",0);
            for(SinhVien x:sv)
            {
                if(x.getId().equals(id))
                {
                    tmpSv=x;
                    break;
                }
            }
            for(MonHoc x:mh)
            {
                if(x.getId().equals(idMH))
                {
                    tmpMh=x;
                    break;
                }
            }
            bd[i]=new BangDiem(tmpSv,tmpMh,score);
        }
        Arrays.sort(bd);
//        for(BangDiem x:bd)
//        {
//            System.out.println(x.getIdSubject());
//        }
        int t=Integer.parseInt(sc3.nextLine());
        while(t-->0)
        {
            String idMH=sc3.nextLine();
            String subName="";
            for(MonHoc x:mh)
            {
                if(x.getId().equals(idMH))
                {
                    subName=x.getName();
                    break;
                }
            }
            System.out.println(String.format("BANG DIEM MON %s:", subName));
            for(BangDiem x:bd)
            {
                
                if(x.getIdSubject().equals(idMH))
                {
                    System.out.println(x);
                }
            }
        }
    }
}
