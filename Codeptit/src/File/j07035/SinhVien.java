/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File.j07035;

/**
 *
 * @author Moment
 */
public class SinhVien {
    private String id,name,idClass,gmail;

    public SinhVien(String id, String name, String idClass, String gmail) {
        this.id = id;
        this.name = this.norN(name);
        this.idClass = idClass;
        this.gmail = gmail;
    }
    public String getId()
    {
        return this.id;
    }
    private String norN(String name)
    {
        String a[]=name.split("\\s+");
        String res="";
        for(int i=0;i<a.length;i++)
        {
            res+=a[i].substring(0,1).toUpperCase()+a[i].substring(1).toLowerCase()+" ";
        }
        return res.trim();
    }
    public String toString()
    {
        return id+" "+name+" "+idClass;
    }
}
