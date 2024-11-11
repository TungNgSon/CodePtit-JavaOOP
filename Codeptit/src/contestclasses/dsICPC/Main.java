/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses.dsICPC;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        Team team[]=new Team[n];
        for(int i=0;i<n;i++)
        {
            team[i]=new Team(i+1,sc.nextLine(),sc.nextLine());
        }
        int m=sc.nextInt();
        sc.nextLine();
        Candidate can[]=new Candidate[m];
        for(int i=0;i<m;i++)
        {
            can[i]=new Candidate(i+1,sc.nextLine());
            String iTeam=sc.nextLine();
            int idx=Integer.parseInt(iTeam.substring(4))-1;
            can[i].setTeam(team[idx]);
            
        }
        Arrays.sort(can);
        for(Candidate x:can)
        {
            System.out.println(x);
        }
    }
}
//2
//BAV_MIS
//Banking Academy of Vietnam
//FTU Knights1
//Foreign Trade University
//6
//Le Trung Toan
//Team01
//Nguyen Trinh Quoc Long
//Team01
//Giang Minh Tung
//Team01
//Nguyen Hang Giang
//Team02
//Nguyen Thanh Nhan
//Team02
//Nguyen Viet Duc
//Team02
