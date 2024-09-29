/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Moment
 */
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class main {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        if(d<0||d>10)
        {
            try {
                throw new TryException("BI LOI");
            } catch (TryException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
