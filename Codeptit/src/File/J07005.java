/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
public class J07005 {
    public static void main(String[] args) throws IOException 
    {
       DataInputStream dis=new DataInputStream(new FileInputStream("DATA.IN"));
       int cnt[]=new int[1000];
       int t=100000;
       while(t-->0)
       {
           cnt[dis.readInt()]++;
       }
       for(int i=0;i<1000;i++)
       {
           if(cnt[i]>0)
           System.out.println(i+" "+cnt[i]);
       }
    }
}
