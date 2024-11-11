/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestdonggoi.bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Moment
 */
public class Matrix {
    private int row,col;
    private ArrayList<ArrayList<Integer>> a;
    public Matrix(ArrayList<ArrayList<Integer>> a)
    {
        this.a=a;
        this.row=a.size();
        this.col=a.get(0).size();
    }
    public ArrayList<ArrayList<Integer>> rev(ArrayList<ArrayList<Integer>> a)
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        int n=a.size();
        int m=a.get(0).size();
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> tmp=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                tmp.add(a.get(j).get(i));
            }
            res.add(tmp);
        }
        return res;
    }
    public void out(ArrayList<ArrayList<Integer>> a)
    {
        for(int i=0;i<a.size();i++)
        {
            for(int j=0;j<a.get(i).size();j++)
            {
                System.out.print(a.get(i).get(j)+" ");
        }
            System.out.println("");
    }
    
}
    public void sortRow(ArrayList<ArrayList<Integer>> a,int row)
    {
        Collections.sort(a.get(row-1));
    }
    
}