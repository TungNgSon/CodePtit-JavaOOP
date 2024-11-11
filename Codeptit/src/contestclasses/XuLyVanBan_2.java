/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class XuLyVanBan_2 {
    static boolean isValid(String s)
    {
        if(s.contains(".")||s.contains(",")||s.contains("!")||s.contains("?")||s.contains(":"))
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("VANBAN.in"));
        TreeSet<String> res=new TreeSet<>();
        while(sc.hasNextLine())
        {
            String s=sc.nextLine();
            String a[]=s.trim().split("\\s+");
            for(String x:a)
            {
                if(isValid(x))
                {
                    res.add(x);
                }
            }
        }
       
        for(String x:res)
        {
            System.out.println(x);
        }
        
    }
}
