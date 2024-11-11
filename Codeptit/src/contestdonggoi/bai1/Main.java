/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestdonggoi.bai1;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc=new Scanner(new File("MATRIX.in"));
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int row=sc.nextInt();
            ArrayList<ArrayList<Integer>> a=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                ArrayList<Integer> tmp=new ArrayList<>();
                for(int j=0;j<m;j++)
                {
                    tmp.add(sc.nextInt());
                }
                a.add(tmp);
        }
            Matrix mat=new Matrix(a);
            ArrayList<ArrayList<Integer>> res=new ArrayList<>();
            ArrayList<ArrayList<Integer>> res1=new ArrayList<>();
            res=mat.rev(a);
            mat.sortRow(res, row);
            res1=mat.rev(res);
            mat.out(res1);
    }
}
}
