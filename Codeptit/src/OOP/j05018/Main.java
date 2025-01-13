/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05018;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Student st[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            String id=String.format("HS%02d", i+1);
            String name=sc.nextLine();
            String a[]=sc.nextLine().split("\\s+");
            Double points[]=new Double[a.length];
            for(int j=0;j<10;j++)
            {
                points[j]=Double.parseDouble(a[j]);
            }
            st[i]=new Student(id,name,points);
            
        }
        Arrays.sort(st);
        for(Student x:st)
        {
            System.out.println(x);
        }
    }
}
//3
//Luu Thuy Nhi
//9.3  9.0  7.1  6.5  6.2  6.0  8.2  6.7  4.8  5.5
//Le Van Tam
//8.0  8.0  5.5  9.0  6.8  9.0  7.2  8.3  7.2  6.8
//Nguyen Thai Binh
//9.0  6.4  6.0  7.5  6.7  5.5  5.0  6.0  6.0  6.0

