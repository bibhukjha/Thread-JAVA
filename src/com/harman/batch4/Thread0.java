public class Thread0 implements Runnable
{
    double num1;
    public Thread0(double num1)
    {
        this.num1=num1;
    }
    @Override
    public void run()
    {
        System.out.println("COSINE value of"+" "+num1+" "+"is:"+" "+ Math.cos(num1));
    }
}
//Thread 2
class Thread1 extends Thread
{
    double num3;
    public Thread1(double num3)
    {
        this.num3=num3;
    }

    @Override
    public void run()
    {
        System.out.println("TAN value of"+" "+num3+" "+"is:"+" "+ Math.tan(num3));
    }
}
// Thread 3
class Thread2 implements Runnable
{
    double num5;
    Thread2(double num5)
    {
        this.num5=num5;
    }
    @Override
    public void run()
    {
        System.out.println("SIN value of"+" "+num5+" "+"is:"+" "+ Math.sin(num5));
    }
}
//Main Thread
class Execution
{
    public static void main(String[] args)
    {
        //  ExecutorService executor = Executors.newFixedThreadPool(4);
        Thread0 pm= new Thread0(24);
        Thread t= new Thread(pm);
        Thread1 pm1= new Thread1(35);
        Thread2 pm2= new Thread2(69);
        Thread t1=new Thread(pm2);
        t.start();
        pm1.start();
        t1.start();
    }
}