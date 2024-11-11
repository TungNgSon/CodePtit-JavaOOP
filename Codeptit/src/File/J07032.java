/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;

/**
 *
 * @author Moment
 */
public class J07032 {
    static boolean check(int n)
    {
        if(n<10)
        {
            return false;
        }
        String s=Integer.toString(n);
        StringBuilder tmp=new StringBuilder(s);
        if(!tmp.equals(tmp.reverse()))
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)-'0')%2==1)
            {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> a=(ArrayList<Integer>)ois.readObject();
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> b=(ArrayList<Integer>)ois1.readObject();
        TreeSet<Integer> se=new TreeSet<>();
        for(Integer x:a)
        {
            if(check(x)&&b.contains(x))
            {
                se.add(x);
            }
        }
        int cnt=0;
        for(Integer x:se)
        {
            System.out.print(x+" ");
            System.out.println(Collections.frequency(a, x)+Collections.frequency(b, x));
            cnt++;
            if(cnt==10)
            {
                break;
            }
        }
    }
}
