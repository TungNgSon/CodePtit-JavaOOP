/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestvaorafile;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class CapSoNgTo2 {
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
         ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA2.in"));
         ArrayList<Integer> b=(ArrayList<Integer>)ois1.readObject();
         Collections.sort(a);
         for(Integer x:a)
         {
          int y=1000000-x;
          if(f[x]==1&&f[y]==1&&x<=y&&a.contains(x)&&a.contains(y)&&!b.contains(x)&&!b.contains(y))
          {
              System.out.println(x+" "+y);
          }
         }
         
    }
}
