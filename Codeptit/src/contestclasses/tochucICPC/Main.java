/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestclasses.tochucICPC;

/**
 *
 * @author Moment
 */
import java.io.*;
import java.util.*;
public class Main 
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc1=new Scanner(new File("INSTITUTION.in"));
        Scanner sc2=new Scanner(new File("REGISTER.in"));
        int n=sc1.nextInt();
        Uni uni[]=new Uni[n];
        for(int i=0;i<n;i++)
        {
            uni[i]=new Uni(sc1.next(),sc1.nextLine());
        }
        int m=Integer.parseInt(sc2.nextLine());
        ArrayList<Team> team=new ArrayList<>();
        while(m-->0)
        {
            String idUni=sc2.next();
            int qtt=sc2.nextInt();
            Uni tmp=new Uni("0","0");
            for(Uni u:uni)
            {
                if(idUni.equals(u.getId()))
                {
                    tmp=u;
                    break;
                }
            }
            sc2.nextLine();
            while(qtt-->0)
            {
                Team t=new Team(sc2.nextLine(),tmp);
                team.add(t);
                
            }
        }
        Collections.sort(team);
        for(int i=0;i<team.size();i++)
        {
            team.get(i).setId("team"+String.format("%02d", i+1));
        }
        for(Team t:team)
        {
            System.out.println(t);
        }
        
    }
}
