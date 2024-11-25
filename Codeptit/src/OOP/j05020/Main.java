/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

/**
 *
 * @author Moment
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        ArrayList<Student> arrayList = new ArrayList<>();
        scanner.nextLine();
        for (int i = 0; i < t; i++) {
            arrayList.add(new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine()));
        }

        Collections.sort(arrayList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getClassName().equals(o2.getClassName())) {
                    return o1.getId().compareTo(o2.getId());
                }
                return o1.getClassName().compareTo(o2.getClassName());
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(arrayList.get(i));
        };
    }
}
