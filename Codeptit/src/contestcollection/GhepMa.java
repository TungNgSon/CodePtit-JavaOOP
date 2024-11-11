/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestcollection;

/**

 */
import java.util.*;
import java.io.*;
public class GhepMa {
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ObjectInputStream ois1=new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream ois2=new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<String> list1 = (ArrayList<String>)ois1.readObject();
        ArrayList<Integer> list2 = (ArrayList<Integer>)ois2.readObject();
        TreeSet<String> se1=new TreeSet<>(list1);
        TreeSet<Integer> se2 = new TreeSet<>(list2);
        for (String x:se1){
            for (int y: se2){
                System.out.println(x+""+y);
            }
        }
    }
}