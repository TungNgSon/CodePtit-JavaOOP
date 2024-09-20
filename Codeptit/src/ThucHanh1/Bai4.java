/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;

import java.util.*;
public class Bai4 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
            String s=inp.next();
            long mul=1;
            long sum=0;
            for(int i=0;i<s.length();i++)
            {
                if(i%2==0&&s.charAt(i)!='0')
                {
                    mul*=(s.charAt(i)-'0');
                }
                else
                {
                    if(i%2==1)
                    {
                        sum+=(s.charAt(i)-'0');
                    }
                }
            }
            System.out.println(mul + " "+sum);
        }
    }
}
