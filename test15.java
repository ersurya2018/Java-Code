import java.io.*;
public class test15 {

	public static void main(String[] args) throws IOException
	{
		float a,b,c;
		a=10;
		b=12;
		System.out.println("Enter the value");
		System.out.println(" 1.add ");
		System.out.println(" 2.sub ");
		System.out.println(" 3.mul ");
		System.out.println(" 4.div ");
		System.out.println(" if chose is 5 ");
		int ch;
		ch=5;
		c=0;
		
		switch(ch)
		{
		case 1:
			c=a+b;
			break;
		case 2:
			c=a-b;
			break;
		case 3:
			c=a*b;
			break;
		case 4:
			break;
			default:
				System.out.println(" invalid choise ");
				break;
				
		}
		System.out.println(" Result is "+ c);
	}

}