/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J03016 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int res=0;
            int dig=1;
            for(int i=0;i<s.length();i++)
            {
                res+=(s.charAt(i)-'0')*dig;
                dig*=-1;
            }
            if(Math.abs(res)%11==0)
            {
                System.out.println(1);
            }
            else
            {
                System.out.println(0);
            }
        }
    }
}
