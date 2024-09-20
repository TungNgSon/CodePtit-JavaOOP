/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;

import java.io.*;
import java.util.*;

class ThiSinh {

    private String id, name, dob;
    private double theo, prac;

    public ThiSinh(int i, String name, String dob, double theo, double prac) {
        this.id = "PH" + String.format("%02d", i);
        this.name = norN(name);
        this.dob = norD(dob);
        this.theo = theo;
        this.prac = prac;
    }

    public String norN(String name) {
        String a[] = name.trim().split("\\s+");
        String res = "";
        for (String x : a) {
            res += x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase() + " ";
        }
        return res.trim();
    }

    public String norD(String dob) {
        String a[] = dob.split("/");
        String res = "";
        res += String.format("%02d", Integer.parseInt(a[0])) + "/";
        res += String.format("%02d", Integer.parseInt(a[1])) + "/";
        res += String.format("%04d", Integer.parseInt(a[2]));
        return res;
    }

    public double getBonus() {
        if (Math.min(prac, theo) >= 8) {
            return 1;
        } else {
            if (Math.min(prac, theo) >= 7.5) {
                return 0.5;
            } else {
                return 0;
            }
        }
    }

    public int getAge() {
        int age = Integer.parseInt(dob.substring(6));
        return 2021 - age;
    }   

    public long getTotal() {
        double avg = (prac + theo) / 2;
        avg += getBonus();
        long sc = Math.round(avg);
        if (sc > 10) {
            return 10;
        }
        return sc;

    }

    public String getState() {
        long sc = this.getTotal();
        if (sc >= 9) {
            return "Xuat Sac";
        } else {
            if (sc == 8) {
                return "Gioi";
            } else {
                if (sc == 7) {
                    return "Kha";
                } else {
                    if (sc >= 5) {
                        return "Trung Binh";
                    } else {
                        return "Truot";
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + getAge() + " " + String.format("%.0f",getTotal()) + " " + getState();
    }

}

public class J07053 {

    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(new File("XETTUYEN.in"));
        int n = Integer.parseInt(inp.nextLine());
        
        System.out.println(n);
        ThiSinh ts[] = new ThiSinh[n];
        for (int i = 0; i < n; i++) {
//            inp.nextLine();
            ts[i] = new ThiSinh(i + 1, inp.nextLine(), inp.nextLine(), Double.parseDouble(inp.nextLine()), Double.parseDouble(inp.nextLine()));
//            inp.nextLine();
        }
        for (ThiSinh x : ts) {
            System.out.println(x);
        }
    }
}
