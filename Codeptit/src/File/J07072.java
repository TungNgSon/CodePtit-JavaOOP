/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.*;
import java.io.*;
public class J07072 {
    static String norN(String s)
    {
        String a[]=s.trim().split("\\s+");
        String res="";
        for(String x:a)
        {
            res+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
            
        }
        return res.trim();
    }
    public static void main(String[] args) throws IOException 
    {
        Scanner inp=new Scanner(new File("DANHSACH.in"));
        List<String> a=new ArrayList<String>();
        while(inp.hasNext())
        {
            String s=inp.nextLine();
            a.add(norN(s));
        }
        
    }
}
