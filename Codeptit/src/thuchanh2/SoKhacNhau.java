/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class SoKhacNhau {
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String>a=(ArrayList<String>)ois.readObject();
        TreeSet<Integer> se=new TreeSet<>();
        for(String x:a)
        {
            String arr[]=x.trim().split("\\s+");
            for(String i:arr)
            {
                try
                {
                    se.add(Integer.parseInt(i));
                }
                catch(Exception e)
                {
                    
                }
            }
            
        }
        for(Integer x:se)
        {
            System.out.println(x);
        }
        
    }
}
