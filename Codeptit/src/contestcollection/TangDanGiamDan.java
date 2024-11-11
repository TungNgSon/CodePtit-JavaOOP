/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestcollection;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class TangDanGiamDan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            TreeSet<Integer> odd=new TreeSet<>();
            TreeSet<Integer> even=new TreeSet<>();
            for(int i=0;i<n;i++)
            {
                int x=sc.nextInt();
                if(x%2==0)
                {
                    even.add(x);
                }
                else
                {
                    odd.add(x);
                }
            }
            for(Integer x:even)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
            for(Integer x: odd.descendingSet())
            {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
