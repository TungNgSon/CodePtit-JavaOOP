/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J02016 {
    static boolean binary_search(ArrayList<Long> a,int l,int r,long x)
    {
        while(l<=r)
        {
            int m=(l+r)/2;
            if(a.get(m)==x)
            {
                return true;
            }
            else
            {
                if(a.get(m)<x)
                {
                    l=m+1;
                }
                else
                {
                    r=m-1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<Long> l=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                long x=sc.nextLong();
                l.add(x*x);
            }
            Collections.sort(l);
            boolean ok=false;
            for(int i=0;i<n-2;i++)
            {
                for(int j=i+1;j<n-1;j++)
                {
                    if(binary_search(l,j+1,n-1,l.get(i)+l.get(j)))
                    {
                        System.out.println("YES");
                        ok=true;
                        break;
                    }
                }
            }
            if(!ok)
            {
                System.out.println("NO");
            }
        }
    }
}
