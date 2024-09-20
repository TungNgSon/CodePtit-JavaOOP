/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;

/**
 *
 * @author Moment
 */
import java.util.*;
public class J03031 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            int k=sc.nextInt();
            HashSet<Character> se=new HashSet<>();
            HashMap<Character,Integer> mp=new HashMap<>();
            for(int i=0;i<s.length();i++)
            {
                if(!mp.containsKey(s.charAt(i)))
                {
                    mp.put(s.charAt(i), 0);
                }
                else
                {
                    mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
                }
                se.add(s.charAt(i));
            }
            int left=0;
            int avai=0;
            for(char c='a';c<='z';c++)
            {
                if(!se.contains(c))
                {
                    left++;
                }
                else
                {
                    avai+=mp.get(c)-1;
                }
            }
            if(avai>=left&&k>=left)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
