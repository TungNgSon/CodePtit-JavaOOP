/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contestcollection;

/**
 *
 * @author Moment
 */
import java.util.*;
import java.io.*;
class Pair<K,V>
{
    private K first;
    private V second;
    public Pair(K first,V second)
    {
        this.first=first;
        this.second=second;
    }
    public boolean isP(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return n>=2;
    }
    public boolean isPrime()
    {
        if(isP((Integer) first)&&isP((Integer) second))
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return first+" "+second; 
    }
}
public class LopPair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
