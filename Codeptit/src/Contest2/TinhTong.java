/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2;

import java.util.*;
import java.io.*;
public class TinhTong {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("DATA.in"));
        long sum=0;
        while(sc.hasNext())
        {
            String s=sc.next();
            try
            {
                sum+=Integer.parseInt(s);
            }
            catch(Exception e)
            {
                
            }
        }
        System.out.println(sum);
    }
}
