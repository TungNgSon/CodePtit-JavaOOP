/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestcollection;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class CapSoTongK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
//            long a[]=new long[n];
            HashMap<Long,Integer> mp=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                long x=sc.nextLong();
                if(!mp.containsKey(x))
                {
                    mp.put(x, 1);
                }
                else
                {
                    mp.put(x, mp.get(x)+1);
                }
            }
            long res=0;
            for(Long x: mp.keySet())
            {
                if(k%2==1||x!=(k/2))
                {
                    if(mp.containsKey(k-x))
                    {
                        res+=(mp.get(x)*mp.get(k-x));
                    }
                }
            }
            res/=2;
            if(k%2==0&&mp.containsKey(k/2))
            {
                long cnt=mp.get(k/2);
                res+=(cnt-1)*cnt/2;
            }
            System.out.println(res);
        }
    }
}