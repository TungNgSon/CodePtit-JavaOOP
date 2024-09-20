/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
public class J07007 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("VANBAN.in"));
        TreeSet<String> se=new TreeSet<String>();
        while(inp.hasNext())
        {
            se.add(inp.next().toLowerCase());
        }
        for(String x:se)
        {
            System.out.println(x);
        }
    }
}
