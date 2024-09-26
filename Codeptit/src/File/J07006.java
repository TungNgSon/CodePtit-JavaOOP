/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class J07006 {
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<Integer> list=(ArrayList<Integer>)ois.readObject();
        int[] dd = new int[1000];
        for (Integer i : list) {
            dd[i]++;
        }
        for (int i = 0; i < 1000; i++) {
            if (dd[i] > 0) {
                System.out.println(i + " " + dd[i]);
            }
        }
    }
}
