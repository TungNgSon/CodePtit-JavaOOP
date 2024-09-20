/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;

import java.util.*;
import java.math.*;
public class Bai3 {
    static boolean isPrime(long n)
    {
        for(int i=2;i<=(int)Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return n>=2;
    }
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
            long n=inp.nextLong();
            long res=-1;
            for(int i=1;i<=(int)Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    if(isPrime(n/i))
                    {
                        res=n/i;
                        break;
                    }
                    else
                    {
                        if(isPrime(i))
                        {
                            res=i;
                        }
                    }
                }
            }
            System.out.println(res);
        }
            
    }
}
