/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;

import java.util.*;
public class Bai1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner (System.in);
        String res="";
        while(inp.hasNext())
        {
            String s=inp.next();
            if(s.length()>res.length())
            {
                res=s;
            }
        }
        System.out.printf("%s - %d",res,res.length());
    }
}
