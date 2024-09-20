/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J08022 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int r[]=new int[n];
            Stack<Integer> st=new Stack<>();
            for(int i=n-1;i>=0;i--)
            {
                while(!st.empty()&&a[i]>=st.peek())
                {
                    st.pop();
                }
                if(st.empty())
                {
                    r[i]=-1;
//                    System.out.println(-1);
                }
                else
                {
//                    System.out.println(st.peek());
                    r[i]=st.peek();
                }
                st.push(a[i]);
            }
            for(int x:r)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
