/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;
import java.util.*;
public class JKT013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<String> q=new ArrayList<>();
            ArrayList<String> res=new ArrayList<>();
            q.add("6");
            q.add("8");
            while(q.get(0).length()<=n)
            {
                String front=q.get(0);
                res.add(front);
                q.remove(0);
                q.add(front+"6");
                q.add(front+"8");
            }
            System.out.println(res.size());
            for(int i=res.size()-1;i>=0;i--)
            {
                System.out.print(res.get(i)+" ");
            }
            System.out.println("");
        }
    }
}
