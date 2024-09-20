/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J03019 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c='a';
        String res="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)>=c)
            {
                res=s.charAt(i)+res;
                c=s.charAt(i);
            }
        }
        System.out.println(res);
    }
}
