import java.io.*;
class get
{
	int m,n;
	 get(int x,int y)
	{
		x=m;
		y=n;
				
	}
	int get1()
	{
		if(m>n)
		{
			return(m);
		}
		else
		{
			return(n);
		}
		
		
	}
	void display()
	{
		System.out.println("Largest number ="+get1());
	}
}
public class test19 {

	public static void main(String[] args) {
		get s=new get(10,20);
	     s.display();
				
		
	}

}
