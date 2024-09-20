/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J08012 {
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);
        int n=inp.nextInt();
        int m=n;
        int cnt[]=new int[n+1];
        n-=1;
        while(n-->0)
        {
            int x=inp.nextInt();
            int y=inp.nextInt();
            cnt[x]+=1;
            cnt[y]+=1;
        }
        Arrays.sort(cnt);
        if(cnt[m]==m-1 &&cnt[m-1]==1)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
