/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;

import java.util.*;
public class Bai6 {
    static String norN(String name)
    {
        String s[]=name.trim().split("\\s+");
        String res="";
        for(String x:s)
        {
            res+=x.substring(0,1).toUpperCase()+x.substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
            int k=inp.nextInt();
            inp.nextLine();
            String a=inp.nextLine();
            String s[]=norN(a).trim().split("\\s+");
            if(k==1)
            {
                System.out.print(s[s.length-1]+" ");
                for(int i=0;i<s.length-1;i++)
                {
                    System.out.print(s[i]+" ");
                }
            }
            else
            {
                for(int i=1;i<s.length;i++)
                {
                    System.out.print(s[i]+" ");
                }
                System.out.print(s[0]);
            }
            System.out.println("");
        }
    }
}
