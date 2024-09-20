/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.danhsachnhanvien;

/**
 *
 * @author Moment
 */
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=Integer.parseInt(inp.nextLine());
        ArrayList<NhanVien> nv=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            nv.add(new NhanVien(i+1,inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine(),inp.nextLine()));
            System.out.println(nv.get(i));
        }
    }
}
//3
//Nguyen Van A
//Nam
//22/10/1982
//Mo Lao-Ha Dong-Ha Noi
//8333012345
//31/12/2013
//Ly Thi B
//Nu
//15/10/1988
//Mo Lao-Ha Dong-Ha Noi
//8333012346
//22/08/2011
//Hoang Thi C
//Nu
//04/02/1981
//Mo Lao-Ha Dong-Ha Noi
//8333012347
//22/08/2011