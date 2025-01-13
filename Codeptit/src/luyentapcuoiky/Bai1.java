/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapcuoiky;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String res="";
        while(sc.hasNext())
        {
            String s=sc.next();
            if(s.length()>res.length())
            {
                res=s;
            }
        }
        System.out.printf("%s - %d",res,res.length());
    }
}
