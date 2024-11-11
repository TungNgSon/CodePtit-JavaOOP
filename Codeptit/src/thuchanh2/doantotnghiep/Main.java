/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.doantotnghiep;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
import java.text.ParseException;
public class Main {
    public static void main(String[] args) throws IOException,ParseException
    {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        ArrayList<String> a=new ArrayList<>();
        while(sc.hasNextLine())
        {
            a.add(sc.nextLine());
        }
        ArrayList<SinhVien> sv=new ArrayList<>();
        for(int i=0;i<a.size();i+=5)
        {
            sv.add(new SinhVien(a.get(i),a.get(i+1),a.get(i+2),a.get(i+3),a.get(i+4)));
        }
        Collections.sort(sv);
        Scanner sc1=new Scanner(new File("HUONGDAN.in"));
        int n=sc1.nextInt();
        sc1.nextLine();
        while(n-->0)
        {
//            sc1.nextLine();
            String s=sc1.nextLine();
            String arr[]=s.trim().split("\\s+");
            int t=Integer.parseInt(arr[arr.length-1]);
            String name="";
            for(int i=0;i<arr.length-1;i++)
            {
                name+=arr[i]+" ";
            }
            name=name.trim();
            while(t-->0)
            {
                String tmp=sc1.nextLine();
                String str[]=tmp.trim().split("\\s+");
                String id=str[0];
                String doan="";
                for(int i=1;i<str.length;i++)
                {
                    doan=doan+str[i]+" ";
                }
                doan=doan.trim();
                for(SinhVien x:sv)
                {
                    if(x.getId().equals(id))
                    {
                        x.setDoan(doan);
                        x.setGv(name);
                        break;
                    }
                }
            }
        }
        Collections.sort(sv);
        for(SinhVien x:sv)
        {
            System.out.println(x);
        }
    }
}
