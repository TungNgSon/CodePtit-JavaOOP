/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.text.*;
import java.util.*;
class SinhVien
    {
        private String Name,Birth,Id,Idc;
        private double Gpa;
        public SinhVien(String Name,String Idc,String Birth,double Gpa)
        {
            this.Name=Name;
            this.Birth=Birth;
            this.Idc=Idc;
            this.Id="B20DCCN001";
            this.Gpa=Gpa;
        }
        public String newBirth()
        {
            String a[]=Birth.split("/");
            String res="";
            res+=String.format("%02d", Integer.parseInt(a[0]))+"/";
            res+=String.format("%02d", Integer.parseInt(a[1]))+"/";
            res+=String.format("%04d", Integer.parseInt(a[2]));
            return res;
        }
        @Override
        public String toString()
        {
            return Id+" "+Name+" "+Idc+" "+newBirth()+" "+String.format("%.2f", Gpa);
       }
    }
public class J04006 {
    
    
    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        SinhVien sv=new SinhVien(inp.nextLine(),inp.next(),inp.next(),inp.nextDouble());
        System.out.println(sv);
    }
   
}
