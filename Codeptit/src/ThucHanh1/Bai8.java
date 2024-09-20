/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;
import java.util.*;
class Num implements Comparable<Num>
{
    private int value,first,count;
    public Num(int value,int first,int count)
    {
        this.value=value;
        this.first=first;
        this.count=count;
    }
    public int getFirst()
    {
        return this.first;
    }
    public int getCount()
    {
        return this.count;
    }
    public int getValue()
    {
        return this.value;
    }
    
    @Override public int compareTo(Num n)
    {
        if(this.count!=n.getCount())
        {
            return n.getCount()-this.count;
        }
        return this.getFirst()-n.getFirst();
    }
}
public class Bai8 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
            int n=inp.nextInt();
            int a[]=new int[n];
            HashMap<Integer,Integer> mpF=new HashMap<>();
            HashMap<Integer,Integer> mpC=new HashMap<>();
            for(int i=0;i<n;i++)
            {
                a[i]=inp.nextInt();
                if(!mpF.containsKey(a[i]))
                {
                    mpF.put(a[i], i);
                    mpC.put(a[i],1);
                }
                else
                {
                    mpC.put(a[i], mpC.get(a[i])+1);
                }
                
            }
            ArrayList<Num> res=new ArrayList<>();
            for(Integer x: mpF.keySet())
            {
                res.add(new Num(x,mpF.get(x),mpC.get(x)));
            }
            Collections.sort(res);
            for(Num x:res)
            {
                for(int i=1;i<=x.getCount();i++)
                {
                System.out.print(x.getValue()+" ");
            }
            }
            System.out.println("");
        }
    }
}
