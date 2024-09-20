/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1.Bai12;

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
        Film f[]=new Film[n];
        Movie mv[]=new Movie[m];
        for(int i=0;i<n;i++)
        {
            f[i]=new Film(sc.nextLine());
            
        }
        for(int i=0;i<m;i++)
        {
            mv[i]=new Movie(i+1,sc.nextLine(),sc.nextLine(),sc.nextLine(),Integer.parseInt(sc.nextLine()));
            String tmp=mv[i].getType();
            int idx=Integer.parseInt(tmp.substring(2))-1;
            mv[i].setType(f[idx].getType());
        }
        Arrays.sort(mv);
        for(Movie x:mv)
        {
            System.out.println(x);
        }
        
        
    }
}
//2 3
//Hai    huoc
//Tinh cam
//TL001
//25/11/2021
//Phim so 1
//10
//TL001
//04/12/2021
//Phim so 2
//15
//TL002
//25/11/2021
//Phim so 3
//5