/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;
import java.io.*;
import java.util.*;

public class J07002 
{
    public static void main(String[] args) throws FileNotFoundException
    {
       Scanner inp=new Scanner(new File("DATA.in"));
       long sum=0;
       while(inp.hasNext())
       {
           try
           {
               sum+=Long.parseLong(inp.next());
           }
           catch(NumberFormatException e)
           {
               
           }
       }
        System.out.println(sum);
    }
}
