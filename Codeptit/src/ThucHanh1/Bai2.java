/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;
import java.util.*;
public class Bai2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
            int res=0;
            String s=inp.next();
            ArrayList<Character> a=new ArrayList<>();
            StringBuilder s1=new StringBuilder("");
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)>='0'&&s.charAt(i)<='9')
                {
                    res+=s.charAt(i)-'0';
                }
                else
                {
                    a.add(s.charAt(i));
                }
            }
            Collections.sort(a);
            for(char x:a)
            {
                System.out.print(x);
            }
            System.out.println(res);
            
                
        }
    }
}
