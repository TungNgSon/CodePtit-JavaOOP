/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.*;
public class J02028 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            long k=sc.nextLong();
            ArrayList<Long> a=new ArrayList<>();
            a.add(sc.nextLong());
            for(int i=1;i<n;i++)
            {
                a.add(sc.nextLong()+a.get(i-1));
            }
            long max=a.get(n-1);
            if(max==k)
            {
                System.out.println("YES");
                continue;
            }
            boolean ok=false;
            for(int i=0;i<n;i++)
            {
                if(a.get(i)+k>max)
                {
                    break;
                }
                else
                {
                    if(a.subList(i+1, n).contains(a.get(i)+k))
                    {
                        ok=true;
                        System.out.println("YES");
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
