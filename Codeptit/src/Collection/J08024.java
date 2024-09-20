/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Collection;
import java.util.*;
import java.math.*;
public class J08024 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            ArrayList<String> res=new ArrayList<>();
            res.add("9");
            while(true)
            {
                BigInteger a = new BigInteger(res.get(0));
                BigInteger N= new BigInteger(Integer.toString(n));
                if(a.mod(N)==BigInteger.ZERO)
                {
                    System.out.println(a);
                    break;
                }
               String tmp=res.get(0);
               res.remove(0);
               res.add(tmp+"0");
               res.add(tmp+"9");
                
            }
            
        }
    }
}
