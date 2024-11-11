/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.danhsachcanh;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int x=sc.nextInt();
                if(x==1&&i<j)
                {
                    Pair<Integer,Integer> p=new Pair<>(i,j);
                    System.out.println(p);
                }
            }
        }
    }
  
}
