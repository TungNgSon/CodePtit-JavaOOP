/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.J07051;

import java.util.*;
import java.io.*;
import java.text.*;
public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner inp=new Scanner(new File("KHACHHANG.in"));
        int n=inp.nextInt();
        KHACHHANG kh[]=new KHACHHANG[n];
        for(int i=0;i<n;i++)
        {
            
            try
            {
            inp.nextLine();
            kh[i]=new KHACHHANG(i+1,inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextInt());
            }
            catch(ParseException e)
            {
                
            }
        }
        Arrays.sort(kh);
        for(KHACHHANG x:kh)
        {
            System.out.println(x);
        }
    }
}
