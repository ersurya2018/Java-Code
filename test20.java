import java.io.*;
class A extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(" i ="+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=5;j++)
		{
			System.out.println(" j ="+j);
		}
	}
}
public class test20 {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		a.start();
		b.start();

	}

}
