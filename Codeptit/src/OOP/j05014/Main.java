/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05014;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        GiaoVien gv[] = new GiaoVien[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            gv[i] = new GiaoVien(i + 1, sc.nextLine(), sc.next(), sc.nextDouble(), sc.nextDouble());
        }
        Arrays.sort(gv);
        for (GiaoVien x : gv) {
            System.out.println(x);
        }
    }
}
//3
//Le Van Binh
//A1
//7.0
//3.0
//Tran Van Toan
//B3
//4.0
//7.0
//Hoang Thi Tam
//C2
//7.0
//6.0
