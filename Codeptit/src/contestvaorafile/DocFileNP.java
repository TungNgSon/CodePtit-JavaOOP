/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestvaorafile;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class DocFileNP {
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
                for(int j=i*i;j<1000000;j+=i)
                {
                    f[j]=0;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        sieve();
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> list=(ArrayList<Integer>)ois.readObject();
        Collections.sort(list);
        TreeSet<Integer> se=new TreeSet<>();
        for(int x:list)
        {
            if(x>=100 && f[x]==1)
            {
                se.add(x);
            }
        }
        for(int x:se)
        {
            System.out.println(x);
        }
    }
}
