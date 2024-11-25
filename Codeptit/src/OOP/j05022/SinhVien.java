/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05022;

/**
 *
 * @author Moment
 */
public class SinhVien {
    private String id,name,idClass,email;

    public SinhVien(String id, String name, String idClass, String email) {
        this.id = id;
        this.name = name;
        this.idClass = idClass;
        this.email = email;
    }

    public String getIdClass() {
        return idClass;
    }
    public String toString()
    {
        return id+" "+name+" "+idClass+" "+email;
    }
}
