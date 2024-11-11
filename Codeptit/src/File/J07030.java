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
public class J07030 {
    static int f[];
    public static void sieve()
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
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        sieve();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA1.in"));
         ArrayList<Integer> a=(ArrayList<Integer>)ois.readObject();
         TreeSet<Integer> se1=new TreeSet<>(a);
         ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA2.in"));
         ArrayList<Integer> b=(ArrayList<Integer>)ois1.readObject();
         TreeSet<Integer> se2=new TreeSet<>(b);
         Collections.sort(a);
         for(Integer x:se1)
         {
          int y=1000000-x;
          if(f[x]==1&&f[y]==1&&x<y&&se1.contains(x)&&se2.contains(y))
          {
              System.out.println(x+" "+y);
          }
         }
         
    }
}