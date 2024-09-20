/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.*;
class Rect
{
    private double width,height;
    private String color;
    public Rect()
    {
        width=1;
        height=1;
        color="NONE";
    }
    public Rect(double w,double h,String c)
    {
        this.color=c;
        this.width=w;
        this.height=h;
    }
    public double getWidth()
    {
        return this.width;
    }
    public double getHeight()
    {
        return this.height;
    }
    public void setWidth(double w)
    {
        this.width=w;
    }
    public void setHeight(double h)
    {
        this.height=h;
    }
    public String getColor()
    {
        return this.color.substring(0,1).toUpperCase()+this.color.substring(1).toLowerCase();
    }
    public void setColor(String c)
    {
        this.color=c;
    }
    public double findArea()
    {
        return this.height*this.width;
    }
    public double findPerimeter()
    {
        return 2*(this.height+this.width);
    }
    
}
public class J04002 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double w=inp.nextDouble();
        double h=inp.nextDouble();
        String c=inp.next();
        Rect r=new Rect(w,h,c);
        if(w<=0||h<=0)
        {
            System.out.println("INVALID");
            return;
        }
        System.out.print((int)r.findPerimeter()+" ");
        System.out.print((int)r.findArea()+" ");
        System.out.println(r.getColor());
    }
}
