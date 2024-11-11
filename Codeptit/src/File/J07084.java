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
import java.text.*;
class User implements Comparable<User>
{
    private String name;
    private Date come,go;
    public User(String name,Date come,Date go)
    {
        this.name=name;
        this.come=come;
        this.go=go;
    }
    public long usingTime()
    {
        long time=go.getTime()-come.getTime();
        return time;
    }
    public String toString()
    {
        return name+" "+usingTime()/(1000*60);
    }
    @Override public int compareTo(User u)
    {
        if(u.usingTime()!=this.usingTime())
        {
        return Long.compare(u.usingTime(), this.usingTime());
        }
        return this.name.compareTo(u.name);
    }
}
public class J07084 {
    public static void main(String[] args) throws IOException,ParseException
    {
        Scanner sc=new Scanner(new File("ONLINE.in"));
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        int n=sc.nextInt();
        User us[]=new User[n];
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=sc.nextLine();
            String come=sc.nextLine();
            String go=sc.nextLine();
            Date comeDate=sdf.parse(come);
            Date goDate=sdf.parse(go);
            us[i]=new User(name,comeDate,goDate);
        }
        Arrays.sort(us);
        for(User x:us)
        {
            System.out.println(x);
        }
    }
}
