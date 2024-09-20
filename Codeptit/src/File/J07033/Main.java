/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07033;

import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("J07033\\DATA.in"));
        int n=Integer.parseInt(inp.nextLine());
        SinhVien a[]=new SinhVien[n];
        for(int i=0;i<n;i++)
        {
            a[i]=new SinhVien(inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine());
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
