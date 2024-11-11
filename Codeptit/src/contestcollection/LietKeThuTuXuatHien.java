/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestcollection;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class LietKeThuTuXuatHien {
    public static void main(String[] args) throws IOException,ClassNotFoundException
    {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a=(ArrayList<String>)ois.readObject();
        Scanner sc=new Scanner(new File("VANBAN.in"));
        ArrayList<String> b=new ArrayList<>();
        while(sc.hasNextLine())
        {
            b.add(sc.nextLine());
        }
        HashSet<String> se=new HashSet<>();
        ArrayList<String> tmp=new ArrayList<>();
        for(String x:a)
        {
            String arr[]=x.trim().split("\\s++");
            for(String i:arr)
            {
                tmp.add(i.toLowerCase());
            }
        }
        for(String x:b)
        {
            String arr[]=x.trim().split("\\s++");
            for(String i:arr)
            {
                if(tmp.contains(i.toLowerCase())&&!se.contains(i.toLowerCase()))
                {
                    System.out.println(i.toLowerCase());
                    se.add(i.toLowerCase());
                }
            }
        }
//        for(String x:se)
//        {
//            System.out.println(x.toLowerCase());
//        }
        
    }
}
