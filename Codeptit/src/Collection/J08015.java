/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;

public class J08015 {
    static int lower_bound(long a[],int l, int r, long x)
{
    int res=r+1;
    while(l<=r)
    {
        int m=(l+r)/2;
        if(a[m]==x)
        {
            res=m;
            r=m-1;
        }
        else
        {
            if(a[m]<x)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
    }
    return res;
}
    static int upper_bound(long a[],int l,int r, long x)
    {
        int res=-1;
    while(l<=r)
    {
        int m=(l+r)/2;
        if(a[m]==x)
        {
            res=m;
            l=m+1;
        }
        else
        {
            if(a[m]<x)
            {
                l=m+1;
            }
            else
            {
                r=m-1;
            }
        }
    }
    return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            long a[]=new long[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextLong();
            }
            long cnt=0;
            Arrays.sort(a);
            for(int i=0;i<n-1;i++)
            {
                int l=lower_bound(a,i+1,n-1,k-a[i]);
                int r=upper_bound(a,i+1,n-1,k-a[i]);
                if(l<=r)
                {
                    cnt+=(r-l+1);
                }
            }
            System.out.println(cnt);
        }
    }
    
}
