/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.*;
import java.math.*;
class GiaoVien
{
    private String id,name;
    private long sal;
    public GiaoVien(String id,String name,long sal)
    {
        this.id=id;
        this.name=name;
        this.sal=sal;
    }
    public long Extra()
    {
        String res=id.substring(0,2);
        if(res.equals("HT"))
        {
            return 2000000;
        }
        else
        {
            if(res.equals("HP"))
            {
                return 900000;
            }
            else
            {
                return 500000;
            }
        }
        
        
    }
    public int Hs()
    {
        return Integer.parseInt(id.substring(2));
    }
    public long Salary()
    {
        return sal*Hs()+Extra();
    }
    @Override
    public String toString()
    {
        return id+" "+name+" "+Hs()+" "+Extra()+" "+Salary();
    }
}
public class J04015 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        GiaoVien gv=new GiaoVien(inp.nextLine(),inp.nextLine(),inp.nextLong());
        System.out.println(gv);
    }
}
