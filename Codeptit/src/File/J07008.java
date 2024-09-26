/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class J07008 
{
    static int n;
    static ArrayList<Integer> a;
    static ArrayList<String> res;
    static boolean isAscend(ArrayList<Integer> v)
    {
        for(int i=0;i<v.size()-1;i++)
        {
            if(v.get(i)>v.get(i+1))
            {
                return false;
            }
        }
        return v.size()>=2;
    }
    static void Try(int i,ArrayList<Integer> list)
    {
        if(isAscend(list))
        {
            String s="";
            for(int j=0;j<list.size();j++)
            {
                s+=Integer.toString(list.get(j))+" ";
            }
            if(!s.trim().equals(""))
            {
            res.add(s.trim());
            }
        }
        for(int j=i;j<n;j++)
        {
            list.add(a.get(j));
            Try(j+1,list);
            list.remove(list.size()-1);
            
        }
        
    }
    public static void main(String[] args) throws IOException
    {
        
        Scanner sc=new Scanner(new File("DAYSO.in"));
        a=new ArrayList<>();
        res=new ArrayList<>();
        
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        Try(0,new ArrayList<Integer>());
        Collections.sort(res);
        for(String s:res)
        {
            System.out.println(s);
        }
    }
}
