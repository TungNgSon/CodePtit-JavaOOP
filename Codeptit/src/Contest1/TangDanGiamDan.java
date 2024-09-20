/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest1;
import java.util.*;
public class TangDanGiamDan {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        while(t-->0)
        {
            int n=inp.nextInt();
    
            ArrayList<Integer> even=new ArrayList<>();
            ArrayList<Integer> odd=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                int x=inp.nextInt();
                if(x%2==0&&!even.contains(x))
                {
                    even.add(x);
                }
                else
                {
                    if(x%2==1&&!odd.contains(x))
                    {
                        odd.add(x);
                    }
                }
            }
            Collections.sort(odd, Comparator.reverseOrder());
            Collections.sort(even);
            for(int x:even)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
            for(int x:odd)
            {
                System.out.print(x+" ");
            }
            System.out.println("");
        }
    }
}
