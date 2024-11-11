/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class TienTo {
    static long cal(long x,long y,String dig)
    {
        if(dig.equals("+"))
        {
            return x+y;
        }
        else
        {
            if(dig.equals("-"))
            {
                return x-y;
            }
            else
            {
                if(dig.equals("*"))
                {
                    return x*y;
                }
                else
                {
                    return x/y;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Stack<Long> st=new Stack<>();
            String a[]=new String[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.next();
            }
            for(int i=n-1;i>=0;i--)
            {
                if(!a[i].equals("+")&&!a[i].equals("-")&&!a[i].equals("*")&&!a[i].equals("/"))
                {
                    st.add(Long.parseLong(a[i]));
                }
                else
                {
                    Long x=st.pop();
                    Long y=st.pop();
                    st.add(cal(x,y,a[i]));
                }
            }
            System.out.println(st.peek());
        }
    }
}
