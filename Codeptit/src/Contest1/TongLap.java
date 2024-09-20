/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest1;

import java.util.*;
import java.math.*;
public class TongLap {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String s=inp.next();
        while(s.length()!=1)
        {
            int tmp=s.length()/2;
            BigInteger a=new BigInteger(s.substring(0, tmp));
            BigInteger b=new BigInteger(s.substring(tmp));
            s=a.add(b).toString();
            System.out.println(s);
        }
    }
}
