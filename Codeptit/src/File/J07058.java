/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;
import java.io.*;
import java.util.*;
class MonHoc implements Comparable<MonHoc>
{
    private String id,name,ways;
    public MonHoc(String id,String name,String ways)
    {
        this.id=id;
        this.name=name;
        this.ways=ways;
    }
    public String getId()
    {
        return this.id;
    }
    @Override public String toString()
    {
        return id+" "+name+" "+ways;
    }
    @Override public int compareTo(MonHoc mh)
    {
        return this.id.compareTo(mh.getId());
    }
}
public class J07058 {
    public static void main(String[] args) throws IOException
    {
       Scanner inp=new Scanner (new File("MONHOC.in"));
       int n=inp.nextInt();
       MonHoc mh[]=new MonHoc[n];
       inp.nextLine();
       for(int i=0;i<n;i++)
       {
           
           mh[i]=new MonHoc(inp.nextLine(),inp.nextLine(),inp.nextLine());
       }
       Arrays.sort(mh);
       for(MonHoc  x:mh)
       {
           System.out.println(x);
       }
    }
}
