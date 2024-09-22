/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class XuLy {
    static boolean check(String x)
    {
        for(int i=0;i<x.length();i++)
        {
            if(x.charAt(i)>='0'&&x.charAt(i)<='9')
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("VANBAN.in"));
        HashSet<String> se=new HashSet<>();
        while(sc.hasNextLine())
        {
            String a[]=sc.nextLine().trim().split("\\s+");
            for(String x:a)
            {
                if(check(x))
                {
                    se.add(x);
                }
            }
        }
        for(String x:se)
        {
            System.out.println(x);
        }
    }
}
