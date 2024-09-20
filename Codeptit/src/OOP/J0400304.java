/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.*;
import java.math.*;
class Ps
{
    private long tu,mau;
    public Ps(long a,long b)
    {
        this.mau=b;
        this.tu=a;
    }
    public void RutGon()
    {
        BigInteger a=BigInteger.valueOf(this.tu);
        BigInteger b=BigInteger.valueOf(this.mau);
        BigInteger tmp=a.gcd(b);
        a=a.divide(tmp);
        b=b.divide(tmp);
        String res=a.toString()+"/"+b.toString();
        System.out.println(res);
    }
   

}
public class J0400304 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        long a=inp.nextLong();
        long b=inp.nextLong();
        long c=inp.nextLong();
        long d=inp.nextLong();
        Ps p=new Ps(a*d+b*c,b*d);
        p.RutGon();
        Double x=2.5;
        System.out.println(x.intValue());
    }
    
}
