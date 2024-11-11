/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh3;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class Bai1 {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("DATA.in"));
        long res=0;
        while(sc.hasNext())
        {
            String s=sc.next();
            if(s.length()>=10)
            {
                try
                {
                    Long tmp=Long.parseLong(s);
                    res+=tmp;
                }
                catch(Exception e)
                {
                    
                }
            }
        }
        System.out.println(res);
    }
    
}
