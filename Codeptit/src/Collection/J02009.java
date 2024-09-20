/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;

public class J02009 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int t[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            t[i]=inp.nextInt();
            d[i]=inp.nextInt();
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(t[i]>t[j])
                {
                    int tmp=t[i];
                    t[i]=t[j];
                    t[j]=tmp;
                    int tmp1=d[i];
                    d[i]=d[j];
                    d[j]=tmp1;
                }
            }
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=Math.max(res, t[i]);
            res+=d[i];
        }
        System.out.println(res);
    }
    
}
