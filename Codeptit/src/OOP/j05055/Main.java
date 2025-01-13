/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP.j05055;

/**
 *
 * @author Moment
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        VDV v[]=new VDV[n];
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        for(int i=0;i<n;i++)
        {
            String id=String.format("VDV%02d", i+1);
            v[i]=new VDV(id,sc.nextLine(),sc.nextLine(),sdf.parse(sc.nextLine()),sdf.parse(sc.nextLine()));
        }
        ArrayList<Long> secList=new ArrayList<>();
        for(VDV x:v)
        {
            if(!secList.contains(x.getTotalSecs()))
            {
                secList.add(x.getTotalSecs());
            }
        }
        Collections.sort(secList);
        for(int i=0;i<secList.size();i++)
        {
            for(VDV x:v)
            {
                if(x.getTotalSecs()==secList.get(i))
                {
                    x.setRank(i+1);
                }
            }
        }
    
    for(VDV x:v)
    {
        System.out.println(x);
    }
    }
}
//3
//Nguyen Van Thanh
//20/03/1990
//07:00:00
//07:10:01
//Nguyen Hoa Binh
//01/10/1993
//07:02:00
//07:11:20
//Le Thanh Van
//15/03/1998
//07:05:00
//07:15:30
