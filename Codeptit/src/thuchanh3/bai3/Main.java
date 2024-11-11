/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3.bai3;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        ArrayList<String> res=new ArrayList<>();
        while(sc.hasNextLine())
        {
            res.add(sc.nextLine());
        }
        ArrayList<SinhVien> sv=new ArrayList<>();
        for(int i=0;i<res.size();i+=5)
        {
            sv.add(new SinhVien(res.get(i),res.get(i+1),res.get(i+2),res.get(i+3),res.get(i+4)));
        }
        Collections.sort(sv);
        for(SinhVien x:sv)
        {
            System.out.println(x);
        }
    }
}
