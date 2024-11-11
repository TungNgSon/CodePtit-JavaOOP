/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thuchanh2.taptukhacnhau;

/**
 *
 * @author Moment
 */
import java.util.*;
public class WordSet {
    private String s;
    public WordSet(String s)
    {
        this.s=s;
        
    }
    public String union(WordSet ws)
    {
        String a[]=this.s.trim().split("\\s+");
        String b[]=ws.s.trim().split("\\s+");
        TreeSet<String> se=new TreeSet<>();
        for(String x:a)
        {
            se.add(x.toLowerCase());
        }
         for(String x:b)
        {
            se.add(x.toLowerCase());
        }
        String res="";
        for(String x:se)
        {
            res=res+x+" ";
        }
        return res.trim();
    }
    public String intersection(WordSet ws)
    {
        String a[]=this.s.trim().split("\\s+");
        String b[]=ws.s.trim().split("\\s+");
        TreeSet<String> se=new TreeSet<>();
        for(String x:a)
        {
            se.add(x.toLowerCase());
        }
        TreeSet<String> seb=new TreeSet<>();
        for(String x:b)
        {
            seb.add(x.toLowerCase());
        }
        String res="";
         for(String x:seb)
        {
            if(se.contains(x.toLowerCase()))
            {
                res=res+x.toLowerCase()+" ";
            }
        }
         return res.trim();
    }
    
}
