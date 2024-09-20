/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class JKT014 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int a[]=new int[n];
            int r[]=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<n;i++)
            {
                while(!st.empty()&&a[i]>=a[st.peek()])
                {
                    st.pop();
                }
                if(st.empty())
                {
                    r[i]=i+1;
                }
                else
                {
                    r[i]=i-st.peek();
                }
                st.push(i);
            }
            for(int x:r)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
