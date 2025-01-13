/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapcuoiky;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Bai10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String res=sc.next();
        int cntX=0;
        int cntT=0;
        ArrayList<Character> a=new ArrayList<>();
        for(int i=0;i<res.length();i++)
        {
            if(res.charAt(i)=='X')
            {
                cntX+=1;
            }
            if(res.charAt(i)=='T')
            {
                cntT+=1;
            }
            a.add(res.charAt(i));
        }
        int cnt=0;
        for(int i=0;i<cntX;i++)
        {
            if(a.get(i)=='T')
            {
                int l=i;
                while(a.get(l)!='X')
                {
                    l+=1;
                }
                Collections.swap(a, i, l);
               // System.out.printf("SWAP o vi tri %d %d",i,l);
                cnt++;
            }
             if(a.get(i)=='D')
            {
                int r=n-1;
                while(a.get(r)!='X')
                {
                    r--;
                }
                Collections.swap(a, i, r);
//                System.out.printf("SWAP o vi tri %d %d",i,r);
                cnt++;
            }
        }
        
        for(int i=cntX;i<cntX+cntT;i++)
        {
            if(a.get(i)=='D')
            {
                cnt+=1;
                //System.out.printf("SWAP o vi tri %d",i);
            }
        }
        System.out.println(cnt);
        
        
    }
}
