/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.util.*;
import java.io.*;
class DN implements Comparable<DN>
{
    private String id,name;
    private int qtt;
    public DN(String id,String name,int qtt)
    {
        this.id=id;
        this.name=name;
        this.qtt=qtt;
             
    }
    public String getId()
    {
        return this.id;
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+qtt;
    }
    @Override 
    public int compareTo(DN d)
    {
        return this.id.compareTo(d.getId());
    }
}

public class J07037 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("DN.in"));
        int n=Integer.parseInt(inp.nextLine());
        DN[] dn=new DN[n];
        for(int i=0;i<n;i++)
        {
            dn[i]=new DN(inp.nextLine(),inp.nextLine(),Integer.parseInt(inp.nextLine()));
            
        }
        Arrays.sort(dn);
        for(DN x:dn)
        {
            System.out.println(x);
        }
    }
    
}
