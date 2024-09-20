/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;
import java.math.*;
        
public class J07003 {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("DATA.in"));
        String s=inp.next();
        if(s.length()==1)
        {
            System.out.println(s);
            return ;
        }
        while(s.length()>1)
        {
            BigInteger a=new BigInteger(s.substring(0,s.length()/2));
            BigInteger b=new BigInteger(s.substring(s.length()/2 ));
            s=a.add(b).toString();
            System.out.println(s);
        }
        
    }
    
}
