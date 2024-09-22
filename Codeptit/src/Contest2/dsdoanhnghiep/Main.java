/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2.dsdoanhnghiep;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("DN.in"));
        int n=sc.nextInt();
        DN dn[]=new DN[n];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            dn[i]=new DN(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        Arrays.sort(dn);
        for(DN x:dn)
        {
            System.out.println(x);
        }
    }
}
