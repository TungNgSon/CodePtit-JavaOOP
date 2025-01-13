/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapcuoiky.bai34;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException
    {
        Scanner sc1=new Scanner(new File("DANHSACH.in"));
        Scanner sc2=new Scanner(new File("HUONGDAN.in"));
        ArrayList<String> res=new ArrayList<>();
        while(sc1.hasNextLine())
        {
            res.add(sc1.nextLine());
        }
        ArrayList<Student> st=new ArrayList<>();
        for(int i=0;i<res.size();i+=5)
        {
            st.add(new Student(res.get(i),res.get(i+1),res.get(i+2),res.get(i+3),res.get(i+4)));
        }
        int t=Integer.parseInt(sc2.nextLine());
        while(t-->0)
        {
            String a[]=sc2.nextLine().trim().split("\\s+");
            String lecturer="";
            for(int i=0;i<a.length-1;i++)
            {
                lecturer+=a[i]+" ";
            }
            lecturer=lecturer.trim();
            int q=Integer.parseInt(a[a.length-1]);
            while(q-->0)
            {
                String arr[]=sc2.nextLine().trim().split("\\s+");
                String id=arr[0];
                String project="";
                for(int i=1;i<arr.length;i++)
                  {
                        project+=arr[i]+" ";
                  }
                project=project.trim();
                for(Student x:st)
                {
                    if(x.getId().equals(id))
                    {
                        x.setProject(lecturer, project);
                    }
                }
            }
        }
        Collections.sort(st);
        for(Student x:st)
        {
            System.out.println(x);
        }
    }
}
