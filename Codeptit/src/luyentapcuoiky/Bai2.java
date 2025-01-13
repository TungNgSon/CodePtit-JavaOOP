/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapcuoiky;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int cnt=0;
            ArrayList<Character> res=new ArrayList<>();
            String s=sc.next();
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                {
                    cnt+=(s.charAt(i)-'0');
                }
                else
                {
                    res.add(s.charAt(i));
                }
            }
            Collections.sort(res);
            for(Character x:res)
            {
                System.out.print(x);
            }
            System.out.println(cnt);
        }
    }
}
