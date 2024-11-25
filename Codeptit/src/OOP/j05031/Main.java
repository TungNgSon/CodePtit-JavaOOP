/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05031;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Student st[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            st[i]=new Student(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        }
        Arrays.sort(st);
        int cnt=1;
        for(Student x:st)
        {
            System.out.printf(cnt+" ");
            System.out.println(x);
            cnt++;
        }
    }
}
