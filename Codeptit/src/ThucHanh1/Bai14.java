/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh1;

import java.util.*;
import java.text.*;
class Student implements Comparable<Student>
{
    private String name;
    private Date st;
    private Date end;
    public Student(String name, Date st, Date end)
    {
        this.name=name;
        this.st=st;
        this.end=end;
        
    }
    public long getDur()
    {
        long a=end.getTime();
        long b=st.getTime();
        return a-b;
    }
    public long getMins()
    {
        long dur=getDur();
        return dur/(60*1000);
    }
    public String getName()
    {
        return this.name;
    }
    @Override public String toString()
    {
        return this.name+" "+this.getMins();
    }
    @Override public int compareTo(Student s)
    {
        if(this.getDur()==s.getDur())
        {
            return this.getName().compareTo(s.getName());
        }
        return Long.compare(s.getDur(), this.getDur());
    }
}
public class Bai14 {
    public static void main(String[] args) throws ParseException
    {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        inp.nextLine();
        Student st[]=new Student[n];
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for(int i=0;i<n;i++)
        {
            String s=inp.nextLine();
            String come=inp.nextLine();
            String go=inp.nextLine();
            Date c=sdf.parse(come);
            Date g=sdf.parse(go);
            st[i]=new Student(s,c,g);
            
        }
        Arrays.sort(st);
        for(Student x:st)
        {
            System.out.println(x);
        }
    }
    
}
//3
//Do Viet Anh
//11/12/2021 16:35:00
//11/12/2021 17:35:00
//Le Tuan Anh
//11/12/2021 16:45:00
//11/12/2021 18:15:00
//Nguyen Tuan Anh
//11/12/2021 17:00:00
//11/12/2021 19:15:00