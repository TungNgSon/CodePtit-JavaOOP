/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05032;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Person ps[]=new Person[n];
        for(int i=0;i<n;i++)
        {
            ps[i]=new Person(sc.next(),sc.next());
        }
        Arrays.sort(ps);
        System.out.printf(ps[0]+"\n"+ps[n-1]);
    }
}
//5
//Nam 01/10/1991
//An 30/12/1990
//Binh 15/08/1993
//Tam 18/09/1990
//Truong 20/09/1990
