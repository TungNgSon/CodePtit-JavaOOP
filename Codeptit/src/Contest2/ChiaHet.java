/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
import java.math.*;
public class ChiaHet {
    public static void main(String[] args) throws IOException
    {
        //Scanner 
        Scanner sc=new Scanner(new File("Codeptit\\src\\Contest2"));
        int n=sc.nextInt();
        sc.nextLine();
        while(n-->0)
        {
            BigInteger a=new BigInteger(sc.nextLine());
            if(a.mod(new BigInteger("7"))==BigInteger.ZERO&&a.mod(new BigInteger("13"))==BigInteger.ZERO)
            {
                System.out.println("Both");
            }
            else
            {
                if(a.mod(new BigInteger("7"))==BigInteger.ZERO)
                {
                    System.out.println("Div 7");
                }
                else
                {
                    if(a.mod(new BigInteger("13"))==BigInteger.ZERO)
                    {
                        System.out.println("Div 13");
                    }
                    else
                    {
                        System.out.println("None");
                    }
                }
            }
                
        }
    }
}
