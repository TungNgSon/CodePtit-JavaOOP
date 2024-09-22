/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class Email {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("DANHSACH.in"));
        HashMap<String,Integer> mp=new HashMap<>();
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String a[]=sc.nextLine().trim().split("\\s+");
            String res=a[a.length-1].toLowerCase();
            for(int i=0;i<a.length-1;i++)
            {
                res=res+a[i].toLowerCase().charAt(0);
            }
            if(!mp.containsKey(res))
            {
                System.out.print(res+"@ptit.edu.vn");
                mp.put(res, 1);
            }
            else
            {
                String tmp=Integer.toString(mp.get(res)+1);
                System.out.print(res+tmp+"@ptit.edu.vn");
                mp.put(res, mp.get(res)+1);
            }
            System.out.println("");
            
        }
            
    }
}
