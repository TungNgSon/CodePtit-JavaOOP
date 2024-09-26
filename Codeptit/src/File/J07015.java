/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class J07015 {
    static int f[];
    
    static void sieve()
    {
        f=new int[10000];
        Arrays.fill(f, 1);
        f[0]=f[1]=0;
        for(int i=2;i<=100;i++)
        {
            if(f[i]==1)
            {
            for(int j=i*i;j<10000;j+=i)
            {
                f[j]=0;
            }
            }
        }
    }
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> list=(ArrayList<Integer>)ois.readObject();
        int cnt[]=new int[10000];
        sieve();
        for(int i=0;i<list.size();i++)
        {
            if(f[list.get(i)]==1)
            {
            cnt[list.get(i)]++;
        }
        }
        for(int i=0;i<10000;i++)
        {
            if(cnt[i]>0)
            {
                System.out.println(i+" "+cnt[i]);
            }
        }
    }
}
