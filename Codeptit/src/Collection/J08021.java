/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J08021 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            Stack<Integer> st=new Stack<>();
            ArrayList<Integer> res=new ArrayList<>();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)=='(')
                {
                    st.push(i);
                }
                else
                {
                    if(st.empty())
                    {
                        res.add(i);
                    }
                    else
                    {
                        int x=st.pop();
                    }
                }
            }
            while(!st.empty())
            {
                res.add(st.pop());
            }
            res.add(-1);
            res.add(s.length());
            int ans=0;
            Collections.sort(res);
            for(int i=0;i<res.size()-1;i++)
            {
                ans=Math.max(ans, res.get(i+1)-res.get(i)-1);
            }
            System.out.println(ans);
        }
    }
}
