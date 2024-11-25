/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j04021;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Moment
 */
public class IntSet {
    private ArrayList<Integer> set;
    public IntSet(int a[])
    {
        this.set=new ArrayList<>();
        for(Integer x:a)
        {
            if(!set.contains(x))
            {
                set.add(x);
            }
        }
        Collections.sort(set);
    }
    public IntSet union(IntSet o)
    {
        ArrayList<Integer> a=this.set;
        ArrayList<Integer>b=o.set;
        ArrayList<Integer> res=new ArrayList<>();
        for(Integer x:a)
        {
            if(!res.contains(x))
            {
                res.add(x);
            }
        }
        for(Integer x:b)
        {
            if(!res.contains(x))
            {
                res.add(x);
            }
        }
        int l=res.size();
        int ans[]=new int[l];
        for(int i=0;i<l;i++)
        {
            ans[i]=res.get(i);
        }
        return new IntSet(ans);
    }
    public String toString()
    {
        String s="";
        for(Integer x:this.set)
        {
            s=s+Integer.toString(x)+" ";
        }
        return s.trim();
    }
}
