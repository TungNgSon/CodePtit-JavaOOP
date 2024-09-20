/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;
import java.util.*;
class SinhVien implements Comparable<SinhVien>
{
    private String id,name,idc,email,num;
    public SinhVien(String id, String name,String idc,String email,String num)
    {
        this.id=id;
        this.name=name;
        this.idc=idc;
        this.email=email;
        this.num="0"+num;
    }
    public String getIdc()
    {
        return this.idc;
    }
    public String getId()
    {
        return this.id;
    }
    @Override public String toString()
    {
        return id+" "+name+" "+idc+" "+email+" "+num;
    }
    @Override public int compareTo(SinhVien sv)
    {
        if(this.idc.equals(sv.getIdc()))
        {
            return this.id.compareTo(sv.getId());
        }
        return this.idc.compareTo(sv.getIdc());
    }
}
public class Bai13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SinhVien> sv=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
        while(sc.hasNextLine())
        {
            list.add(sc.nextLine());
        }
        for(int i=0;i<list.size();i+=5)
        {
            sv.add(new SinhVien(list.get(i),list.get(i+1),list.get(i+2),list.get(i+3),list.get(i+4)));
        }
        Collections.sort(sv);
        for(SinhVien x:sv )
        {
            System.out.println(x);
        }
    }
}
