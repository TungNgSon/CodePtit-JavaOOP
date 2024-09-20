/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest1;

import java.util.*;
public class TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        int m=inp.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int x=inp.nextInt();
            if(!a.contains(x))
            {
            a.add(x);
            }
        }
        for(int i=0;i<m;i++)
        {
            int x=inp.nextInt();
            if(!b.contains(x))
            {
            b.add(x);
            }
        }
        ArrayList<Integer> unit=new ArrayList<>();
        Collections.sort(a);
        Collections.sort(b);
        for(int x:a)
        {
            if(b.contains(x))
            {
                System.out.print(x+" ");
            }
        }
        System.out.println("");
      
        
        for(int x:a)
        {
            if(!b.contains(x))
            {
                System.out.print(x+" ");
            }
        }
        System.out.println("");
        for(int x:b)
        {
            if(!a.contains(x))
            {
                System.out.print(x+" ");
            }
        }
        
    }
}
