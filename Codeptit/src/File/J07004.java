/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
public class J07004 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("DATA.in"));
        int cnt[]=new int[1005];
        while(inp.hasNext())
        {
            int n=Integer.parseInt(inp.next());
            cnt[n]+=1;
        }
        for(int i=0;i<1001;i++)
        {
            if(cnt[i]>0)
            {
                System.out.printf("%d %d\n", i, cnt[i]);
            }
                
        }
    }
}
