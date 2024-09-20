/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07034;

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("MONHOC.in"));
        int n=Integer.parseInt(inp.nextLine());
        MonHoc mh[]=new MonHoc[n];
        for(int i=0;i<n;i++)
        {
            mh[i]=new MonHoc(inp.nextLine(),inp.nextLine(),Integer.parseInt(inp.nextLine()));
        }
        Arrays.sort(mh);
        for(MonHoc x:mh)
        {
            System.out.println(x);
        }
        
    }
}
