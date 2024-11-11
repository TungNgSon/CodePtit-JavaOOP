/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2;

/**
 *
 * @author Moment
 */
import java.util.*;

public class TinhDiem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double a[]=new double[n];
        double mi=11;
        double mx=-1;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextDouble();
            mi=Math.min(mi, a[i]);
            mx=Math.max(mx, a[i]);
        }
        int cnt=0;
        double sum=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=mi&&a[i]!=mx)
            {
                sum+=a[i];
                cnt+=1;
            }
        }
        System.out.println(String.format("%.2f", sum/cnt));
    }
    
}
