/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestvaorafile;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class GiaTriNhiPhan {
    public static long DecValue(String s)
    {
        long sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=(s.charAt(i)-'0')*Math.pow(2, s.length()-i-1);
        }
        return sum;
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
         ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
         ArrayList<String> list=(ArrayList<String>)ois.readObject();
         for(String x:list)
         {
             String tmp="";
             for(int i=0;i<x.length();i++)
             {
                 if(x.charAt(i)=='0'||x.charAt(i)=='1')
                 {
                     tmp+=x.charAt(i);
                 }
             }
             System.out.println(tmp+" "+DecValue(tmp));
             
         }
         
    }
}
