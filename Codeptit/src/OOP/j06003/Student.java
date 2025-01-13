/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j06003;

/**
 *
 * @author Moment
 */
public class Student {
    private String id,name,phoneNumber;

    public Student(String id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String toString()
    {
        return id+" "+name+" "+phoneNumber+"\n";
    }
}
