/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class J02024 {
    static Scanner sc=new Scanner(System.in);
    static int n;
    static ArrayList<Integer> a=new ArrayList<>();
    static ArrayList<ArrayList<Integer> > res=new ArrayList<>();
    static void Try(int i,ArrayList<Integer> v,int sum)
    {
        if(sum%2==1)
        {
            
            res.add(new ArrayList<>(v));
          
            
        }
        for(int j=i;j<n;j++)
            {
                v.add(a.get(j));
                Try(j+1,v,sum+a.get(j));
                v.removeLast();
            }
    }
    static void solve()
    {
        res.clear();
        a.clear();
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        Collections.sort(a, Collections.reverseOrder());
        ArrayList<Integer> v=new ArrayList<>();
        Try(0,v ,0);
          res.sort((list1, list2) -> {
            int size1 = list1.size();
            int size2 = list2.size();
            for (int i = 0; i < Math.min(size1, size2); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    return list1.get(i) - list2.get(i);
                }
            }
            return size1 - size2;
        });
        for(ArrayList<Integer> x:res)
        {
            for(int i=0;i<x.size();i++)
            {
                System.out.print(x.get(i)+" ");
            }
            System.out.println("");
        }
        
        
    }
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0)
        {
            solve();
            System.out.println("");
        }
    }
}
