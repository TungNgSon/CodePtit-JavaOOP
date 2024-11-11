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
public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            Queue<String> q=new LinkedList<>();
            q.add("4");
            q.add("5");
            int dem=0;
            while(dem<n)
            {
                String tmp=q.peek();
                q.poll();
                StringBuilder rev=new StringBuilder(tmp).reverse();
                System.out.print(tmp+rev+" ");
                dem++;
                q.add(tmp+"4");
                q.add(tmp+"5");
            }
            System.out.println("");
        }
    }
}
