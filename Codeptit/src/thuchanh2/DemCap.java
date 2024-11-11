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
public class DemCap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int [n+1];
        for(int i=1;i<=n;i++)
        {
            a[i]=sc.nextInt();
        }
        int r[]=new int [n+1];
        int l[]=new int [n+1];
        Stack<Integer> st=new Stack<>();
        for(int i=n;i>=1;i--)
        {
            while(!st.empty()&&a[st.peek()]<=a[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                r[i]=n+1;
            }
            else
            {
                r[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=1;i<=n;i++)
        {
            while(!st.empty()&&a[st.peek()]<=a[i])
            {
                st.pop();
            }
            if(st.empty())
            {
                l[i]=0;
            }
            else
            {
                l[i]=st.peek();
            }
            st.push(i);
        }
//        for(int i=1;i<=n;i++)
//        {
//            System.out.print(r[i]+" ");
//        }
//        System.out.println("");
//        for(int i=1;i<=n;i++)
//        {
//            System.out.print(l[i]+" ");
//        }
        int cnt=0;
        for(int i=1;i<n;i++)
        {
            int idx=r[i];
            for(int j=idx;j>i+1;j--)
            {
                if(l[j]<=i)
                {
                    System.out.println("Cap so tm : "+i+" "+j);
                    cnt++;
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
