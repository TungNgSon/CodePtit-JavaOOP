/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2;

import java.util.*;
import java.io.*;
public class LoaiBoSoNguyen {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("DATA.in"));
        ArrayList<String> a=new ArrayList<>();
        while(sc.hasNext())
        {
            String s=sc.next();
            try
            {
                int x=Integer.parseInt(s);
            }
            catch(Exception e)
            {
                a.add(s);
            }
        }
        Collections.sort(a);
        for(String x:a)
        {
            System.out.print(x+" ");
        }
    }
}
