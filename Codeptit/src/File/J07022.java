/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
public class J07022 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("DATA.in"));
        ArrayList<String> list=new ArrayList<String>();
        while(inp.hasNext())
        { 
            String s=inp.next();
            try
            {
                
                int n=Integer.parseInt(s);
            }
            catch(NumberFormatException e)
            {
                list.add(s);
            }
            
                    
                    
        }
        Collections.sort(list);
            for(String x:list)
            {
                System.out.print(x+" ");
            }
        
    }
}