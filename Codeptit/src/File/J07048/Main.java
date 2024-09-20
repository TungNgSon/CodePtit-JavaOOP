/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07048;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("SANPHAM.in"));
        int n=Integer.parseInt(inp.nextLine());
        SANPHAM sp[]=new SANPHAM[n];
        for(int i=0;i<n;i++)
        {
            sp[i]=new SANPHAM(inp.nextLine(),inp.nextLine(),Integer.parseInt(inp.nextLine()),Integer.parseInt(inp.nextLine()));
        }
        Arrays.sort(sp);
        for(SANPHAM x:sp)
        {
            System.out.println(x);
        }
    }
}
