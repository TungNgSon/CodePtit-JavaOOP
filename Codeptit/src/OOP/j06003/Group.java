/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j06003;

import java.util.ArrayList;

/**
 *
 * @author Moment
 */
public class Group {
    private String id;
    private String project;
    private ArrayList<Student> members;
    public Group(String id)
    {
        this.id=id;
        members=new ArrayList<>();
    }
    public void setProject(String project)
    {
        this.project=project;
    }
    public void addMember(Student st)
    {
        this.members.add(st);
    }
    public String toString()
    {
        String res=String.format("DANH SACH NHOM %s:\n", this.id);
        for(int i=0;i<members.size();i++)
        {
            res+=members.get(i).toString();
        }
        res+=String.format("Bai tap dang ky: %s", this.project);
        return res;
        
    }
    
    
}
