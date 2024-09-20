/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest1.lop_user;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=inp.nextInt();
        ArrayList<TaiKhoan> user=new ArrayList<>();
        ArrayList<TaiKhoan> login=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            user.add(new TaiKhoan(inp.next(),inp.next()));
        }
        int m=inp.nextInt();
        for(int i=0;i<m;i++)
        {
            login.add(new TaiKhoan(inp.next(),inp.next()));
        }
        for(TaiKhoan x:user)
        {
            int cnt=0;
            for(TaiKhoan y:login)
            {
                if(x.isValid(y))
                {
                    cnt+=1;
                }
            }
            System.out.print(cnt+" ");
        }
    }
}
//4
//tendangnhap matkhau
//username password
//nguoidung m4tkh4un4yr4tb40m4t
//user2 password
//6
//tendangnhap matkhau
//username matkhau
//bfc34 contest
//username password
//tendangnhap matkhau
//user2 password
