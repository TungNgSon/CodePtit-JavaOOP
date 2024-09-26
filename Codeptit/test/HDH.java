/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Moment
 */
public class HDH {
    public static class th1 extends Thread
    {
        public boolean isValid(int n)
        {
            int sum=1;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                {
                    if(i!=(n/i))
                    {
                        sum+=i;
                        sum+=(n/i);
                    }
                    else
                    {
                        sum+=i;
                    }
                }
            }
            if(sum==n)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        @Override public void run()
        {
            for(int i=1;i<=10000;i++)
            {
                if(isValid(i))
                {
                    System.out.println("So hoan hao :"+i);
                }
            }
        }
    }
    public static class th2 extends Thread
    {
        
        @Override public void run()
        {
            for(int i=9;i<=10000;i+=9)
            {
                System.out.println("So chia het cho 9 :"+i);
            }
        }
    }
    public static class th3 extends Thread
    {
        public boolean isPrime(int n)
        {
            for(int i=2;i<Math.sqrt(n);i+=1)
            {
                if(n%i==0)
                {
                    return false;
            }
                
        }
    return n>=2;
}
        @Override public void run()
        {
            for(int i=1;i<=10000;i++)
            {
                if(isPrime(i))
                {
                    System.out.println("So nguyen to :"+i);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        th1 t1=new th1();
        t1.start();
        th2 t2=new th2();
        t2.start();
        th3 t3=new th3();
        t3.start();
    }
}
