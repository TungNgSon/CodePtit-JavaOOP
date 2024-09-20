/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;
import java.util.*;
import java.math.*;
class Point
{
    private double x,y;
    public Point(double x,double y)
    {
        this.x=x;
        this.y=y;
        
    }
    public double Dis(Point p)
    {
        return Math.sqrt(Math.pow(this.x-p.x, 2)+Math.pow(this.y-p.y, 2));
    }
    @Override 
    public String toString()
    {
        return Double.toString(x)+" "+Double.toString(y);
    }
}
public class J04008 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
        Point a= new Point(inp.nextDouble(),inp.nextDouble());
        Point b= new Point(inp.nextDouble(),inp.nextDouble());
        Point c= new Point(inp.nextDouble(),inp.nextDouble());
        double a1=a.Dis(b),b1=b.Dis(c),c1=c.Dis(a);
           
        if(a1+b1>c1&&a1+c1>b1&&b1+c1>a1)
        {
            System.out.println(String.format("%.3f",a1+b1+c1));
        }
        else
        {
            System.out.println("INVALID");
        }
    }
        }
    
}
