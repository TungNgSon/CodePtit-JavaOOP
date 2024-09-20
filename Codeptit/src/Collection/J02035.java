/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J02035 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
        int n=inp.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++)
        {
            a[i]=inp.nextLong();
        }
        int l=0;
        while(l<n-1&&a[l]<=a[l+1])
        {
            l++;
        }
        System.out.println((l+1)%n);
    }
    }
}
