/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;

import java.util.*;
public class Bai5 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int t=inp.nextInt();
        inp.nextLine();
        while(t-->0)
        {
        String s[]=inp.nextLine().trim().split("\\s+");
        for(int i=s.length-1;i>=0;i--)
        {
            System.out.print(s[i]+" ");
        }
        System.out.println("");
        
        }
    }
}
