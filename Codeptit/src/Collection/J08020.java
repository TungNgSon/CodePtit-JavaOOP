/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J08020 {
    static boolean isClose(char c)
    {
        if(c==')'||c=='}'||c==']')
        {
            return true;
        }
        return false;
    }
    static boolean isValid(char a,char b)
    {
        if(a=='('&&b==')')
        {
            return true;
        }
        if(a=='{'&&b=='}')
        {
            return true;
        }
        if(a=='['&&b==']')
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            boolean ok=true;
            Stack<Character> st=new Stack<>();
            for(int i=0;i<s.length();i++)
            {
                if(!isClose(s.charAt(i)))
                {
                    st.push(s.charAt(i));
                }
                else
                {
                    if(st.empty())
                    {
                        ok=false;
                        System.out.println("NO");
                        break;
                    }
                    if( !isValid(st.peek(),s.charAt(i)))
                    {
                        ok=false;
                        System.out.println("NO");
                        break;
                    }
                    else
                    {
                        char c=st.pop();
                    }
                }
            }
            if(ok==true)
        {
            if(!st.empty())
            {
                System.out.println("NO");
            }
            else
            {
                System.out.println("YES");
            }
        }
        }
        
    }
}
