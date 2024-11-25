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
class Lecturer {
    private String id, name, department;
    private static int count = 0;
    public Lecturer(String name, String department) {
        this.name = name;
        this.department = department;
        count++;
        this.id = String.format("GV%02d", count);
    }

    public static String formatDepartment(String department) {
        String a[] = department.split(" ");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            res += Character.toUpperCase(a[i].charAt(0));
        }
        return res;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + formatDepartment(department);
    }
}
public class J05026 {
     public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<Lecturer> a = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            a.add(new Lecturer(input.nextLine(), input.nextLine()));
        }
        int q = Integer.parseInt(input.nextLine());
        while (q-- > 0) {
            String inputDepartment = input.nextLine();
            System.out.printf("DANH SACH GIANG VIEN BO MON %s:\n", Lecturer.formatDepartment(inputDepartment));
            for (Lecturer x : a) {
                if (x.getDepartment().equals(inputDepartment)) {
                    System.out.println(x);
                }
            }
        }
        
    }
    
}
