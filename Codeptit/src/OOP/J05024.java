/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

/**
 *
 * @author Moment
 */
import java.util.*;
class Student {
    private String id, name, className, email;

    public Student(String id, String name, String className, String email) {
        this.id = id;
        this.name = name;
        this.className = className;
        this.email = email;
    }

    public String getClassName() {
        return className;
    }
    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + className + " " + email;
    }
}
public class J05024 {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        ArrayList<Student> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Student(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()));
        }
        int q = Integer.parseInt(input.nextLine());
        while (q-- > 0) {
            String major = input.nextLine();
            String s = new String();

            if (major.equals("Ke toan")) {
                s = "DCKT";
            } else if (major.equals("Cong nghe thong tin")) {
                s = "DCCN";
            } else if (major.equals("An toan thong tin")) {
                s = "DCAT";
            } else if (major.equals("Vien thong")) {
                s = "DCVT";
            } else if (major.equals("Dien tu")) {
                s = "DCDT";
            }
            System.out.printf("DANH SACH SINH VIEN NGANH %s:\n", major.toUpperCase());
            for (Student x : a) {
                if (x.getId().substring(3,7).equals(s) ) {
                    if ((s == "DCCN" || s == "DCAT") && x.getClassName().charAt(0) == 'E') {
                        continue;
                    }
                    System.out.println(x);
                }
            }
        }
        
    }
}
