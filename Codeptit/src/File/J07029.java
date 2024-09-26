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
public class J07029 {
     static int f[];
    
    static void sieve()
    {
        f=new int[1000001];
        Arrays.fill(f, 1);
        f[0]=f[1]=0;
        for(int i=2;i<=1000;i++)
        {
            if(f[i]==1)
            {
            for(int j=i*i;j<=1000000;j+=i)
            {
                f[j]=0;
            }
            }
        }
    }
    public static void main(String[] args)throws IOException,ClassNotFoundException
    {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list=(ArrayList<Integer>)ois.readObject();
        int cnt[]=new int[1000001];
        sieve();
        for(int i=0;i<list.size();i++)
        {
            if(f[list.get(i)]==1)
            {
            cnt[list.get(i)]++;
        }
        }
        int dem=0;
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=(int)1e6;i>=2;i--)
        {
            
            if(f[i]==1&&cnt[i]>0)
            {
                System.out.println(i+" "+cnt[i]);
                dem++;
                if(dem==10)
            {
                return;
            }
            }
        }
        
        
    }
}
