/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;
import java.text.*;
import java.util.*;
class ThiSinh
{
    private String name,birth;
    private double a,b,c;
    public ThiSinh(String name, String birth, double a, double b, double c)
    {
        this.name=name;
        this.birth=birth;
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double getPoints()
    {
        return (a+b+c);
    }
    @Override
    public String toString()
    {
        return name+" "+birth+" "+String.format("%.1f", getPoints());
    }
}
public class J04005 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        ThiSinh t=new ThiSinh(inp.nextLine(),inp.next(),inp.nextDouble(),inp.nextDouble(),inp.nextDouble());
        System.out.println(t);
    }
}
