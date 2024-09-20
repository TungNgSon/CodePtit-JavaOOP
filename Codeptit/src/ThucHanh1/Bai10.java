/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;
import java.util.*;
public class Bai10 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        StringBuilder s=new StringBuilder(inp.next());
        int cntx=0;
        int cntt=0;
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='X')
            {
                cntx+=1;
            }
            else
            {
                if(s.charAt(i)=='T')
                {
                    cntt+=1;
                }
            }
        }
        int cnt=0;
        for(int i=0;i<cntx;i++)
        {
            if(s.charAt(i)=='T')
            {
                int idx=i+1;
                while(idx<s.length()&&s.charAt(idx)!='X')
                {
                    idx+=1;
                }
                if(idx<s.length())
                {
                   
                    char tmp=s.charAt(idx);
                    s.setCharAt(idx, s.charAt(i));
                    s.setCharAt(i, tmp);
                }
                cnt++;
            }
            else
            {
                if(s.charAt(i)=='D')
                {
                    int idx=s.length()-1;
                while(idx>=0&&s.charAt(idx)!='X')
                {
                    idx-=1;
                }
                if(idx>=0)
                {
                   
                    char tmp=s.charAt(idx);
                    s.setCharAt(idx, s.charAt(i));
                    s.setCharAt(i, tmp);
                }
                cnt++;
                }
            }
        }
        for(int i=cntx;i<cntx+cntt;i++)
        {
            if(s.charAt(i)!='T')
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
