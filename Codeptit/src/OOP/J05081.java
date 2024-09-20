/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;
import java.util.*;
class MatHang implements Comparable<MatHang>
{
    private String id,name,dv;
    private int buy,sell;
    public MatHang(int i,String name,String dv, int buy, int sell)
    {
        this.id="MH"+String.format("%03d", i);
        this.name=name;
        this.dv=dv;
        this.buy=buy;
        this.sell=sell;
    }
    public int profit()
    {
        return this.sell-this.buy;
    }
    @Override 
    public String toString()
    {
        return id+" "+name+" "+dv+" "+buy+" "+sell+" "+profit();
    }
    @Override 
    public int compareTo(MatHang mh)
    {
        if(this.profit()!=mh.profit())
        {
            return (mh.profit()-this.profit());
        }
        return Integer.parseInt(this.id.substring(2))-Integer.parseInt(mh.id.substring(2));
    }
}
public class J05081 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        inp.nextLine();
        ArrayList<MatHang> mh=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            MatHang a=new MatHang(i+1,inp.nextLine(),inp.nextLine(),inp.nextInt(),inp.nextInt());
            mh.add(a);
            inp.nextLine();

        }
        Collections.sort(mh);
        for(MatHang x:mh)
        {
            System.out.println(x);
        }
    }
}
