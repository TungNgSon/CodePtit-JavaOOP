/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest2.dsmonhoc;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("MONHOC.in"));
        int n=sc.nextInt();
        MonHoc mh[]=new MonHoc[n];
        for(int i=0;i<n;i++)
        {
            sc.nextLine();
            mh[i]=new MonHoc(sc.nextLine(),sc.nextLine(),sc.nextInt());
        }
        Arrays.sort(mh);
        for(MonHoc x:mh)
        {
            System.out.println(x);
        }
    }
}
