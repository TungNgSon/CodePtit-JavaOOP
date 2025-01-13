/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j06003;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        Group gr[]=new Group[m];
        for(int i=0;i<m;i++)
        {
            gr[i]=new Group(Integer.toString(i+1));
        }
        for(int i=0;i<n;i++)
        {
            
            Student st=new Student(sc.nextLine(),sc.nextLine(),sc.nextLine());
            int idx=Integer.parseInt(sc.nextLine());
            gr[idx-1].addMember(st);
        }
        
        for(int i=0;i<m;i++)
        {
            String project=sc.nextLine();
            gr[i].setProject(project);
        }
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int q=Integer.parseInt(sc.nextLine());
            System.out.println(gr[q-1]);
        }
    }
}
//5 2
//B17DTCN001
//Nguyen Chi  Linh
//0987345543
//1
//B17DTCN011
//Vu Viet Thang
//0981234567
//1
//B17DTCN023
//Pham Trong Thang
//0992123456
//1
//B17DTCN022
//Nguyen Van  Quyet
//0977865432
//2
//B17DTCN031
//Ngo Thanh Vien
//0912313111
//2
//Xay dung website ban dien thoai truc tuyen
//Xay dung ung dung quan ly benh nhan Covid-19
//1
//1
