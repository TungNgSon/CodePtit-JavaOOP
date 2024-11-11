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
public class DaoTu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s=sc.nextLine();
            Stack<String> st=new Stack<>();
            String a[]=s.trim().split("\\s+");
            for(String x:a)
            {
                st.push(x);
            }
            while(!st.empty())
            {
                System.out.print(st.pop()+" ");
            }
            System.out.println("");
        }
    }
}
