/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contest1.ds_icpc;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n=Integer.parseInt(inp.nextLine());
        ArrayList<Team> t=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            t.add(new Team(i+1,inp.nextLine(),inp.nextLine()));
        }
        int m=Integer.parseInt(inp.nextLine());
        ArrayList<Candidate> can=new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            can.add(new Candidate(i+1,inp.nextLine(),inp.nextLine()));
            int idx=Integer.parseInt(can.get(i).getIdt().substring(4))-1;
            can.get(i).setTeam(t.get(idx));
        }
        Collections.sort(can);
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
