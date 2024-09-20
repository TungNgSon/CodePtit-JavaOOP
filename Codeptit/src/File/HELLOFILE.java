/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package File;
import java.io.*;
import java.util.*;
public class HELLOFILE {
    public static void main(String[] args) throws FileNotFoundException
    {
          Scanner inp=new Scanner(new File("Hello.txt"));
        while(inp.hasNext())
        {
            System.out.println(inp.next());
        }
        
    }
}
