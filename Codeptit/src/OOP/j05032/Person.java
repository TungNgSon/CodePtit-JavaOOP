/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05032;

/**
 *
 * @author Moment
 */
import java.text.*;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Person implements Comparable<Person>
{
    private String name,dob;
    public Person(String name,String dob)
    {
        this.name=name;
        this.dob=dob;
    }
    public long getAge() throws ParseException
    {
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=sdf.parse(dob);
        return date.getTime();
    }
    public String toString()
    {
        return name;
    }
    @Override 
    public int compareTo(Person p)
    {
        try {
            return -Long.compare(this.getAge(), p.getAge());
        } catch (ParseException ex) {
            Logger.getLogger(Person.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }
    
}
