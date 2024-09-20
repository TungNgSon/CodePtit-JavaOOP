/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

import java.util.*;
public class J02037 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String a[]=sc.nextLine().trim().split("\\s+");
            int cnt=0;
            for(String x:a)
            {
                if(Integer.parseInt(x)%2==0)
                {
                    cnt++;
                }
            }
            if(a.length%2==0&&cnt>a.length-cnt)
            {
                System.out.println("YES");
            }
            else
            {
            if(a.length%2==1&&cnt<a.length-cnt)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            }
        }
    }
}
