/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luyentapcuoiky.bai34;

/**
 *
 * @author Moment
 */
public class Student implements Comparable<Student>
{
    private String id,name,idClass,gmail,phoneNumber;
    private String lecturer,project;

    public Student(String id, String name, String idClass, String gmail,String phoneNumber) {
        this.id = id;
        this.name = name;
        this.idClass = idClass;
        this.gmail = gmail;
        this.phoneNumber="0"+phoneNumber;
    }
    public String getId()
    {
        return this.id;
    }
    public void setProject(String lecturer,String project)
    {
        this.lecturer=lecturer;
        this.project=project;
    }
    public String toString()
    {
        return id+" "+name+" "+lecturer+" "+project+" "+phoneNumber;
    }
    @Override 
    public int compareTo(Student st)
    {
        return this.id.compareTo(st.id);
    }
    
    
    
}

