/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
public class J07021 {
    public static String normalize(String s)
    {
        String res=" ";
        String a[]=s.trim().split("\\s+");
        for(String x:a)
        {
            res=res+x.substring(0, 1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        res=res.substring(0, res.length()-1);
        
        return res;
    }
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("DATA.in"));
        while(true)
        {
            String s=inp.nextLine();
            if(s.equals("END"))
            {
                return;
            }
            System.out.println(normalize(s));
        }
    }
}
